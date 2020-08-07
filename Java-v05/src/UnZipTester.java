import java.util.*;
import java.util.zip.*;
import java.lang.*;
import java.io.*;

class Unzip{
    byte doc[] = null;          // 存储解压缩数据的缓冲字节数组
    String Filename = null;     // 压缩文件名字字符串
    String UnZipPath = null;    // 解压缩路径字符串

    public Unzip(String filename, String unZipPath){
        this.Filename = filename;
        this.UnZipPath = unZipPath;
        this.setUnZipPath(this.UnZipPath);
    }

    public Unzip(String filename){
        this.Filename = new String(filename);
        this.UnZipPath = null;
        this.setUnZipPath(this.UnZipPath);
    }

    private void setUnZipPath(String unZipPath){
        if(unZipPath.endsWith("\\"))
            this.UnZipPath = new String(unZipPath);
        else
            this.UnZipPath = new String(unZipPath+"\\");
    }

    public void doUnZip(){
        try{
            ZipInputStream zipis = new ZipInputStream(new FileInputStream(Filename));
            ZipEntry fEntry = null;
            while((fEntry = zipis.getNextEntry()) != null){
                if(fEntry.isDirectory())        // 是路径则创建路径
                    checkFilePath(UnZipPath+fEntry.getName());
                else{
                    String fname = new String(UnZipPath + fEntry.getName());
                    try{
                        FileOutputStream out = new FileOutputStream(fname);
                        doc = new byte[512];
                        int n;
                        while((n = zipis.read(doc,0,512)) != -1)
                            out.write(doc, 0 ,n);
                        out.close();
                        out = null;
                        doc = null;
                    }catch(Exception ex){

                    }
                }
            }
            zipis.close();
        }catch(IOException iox){
            System.out.println("Problem reading "+Filename);
        }
    }

    private void checkFilePath(String dirName) throws IOException{
        File dir = new File(dirName);
        if(!dir.exists())
            dir.mkdirs();
    }
}

public class UnZipTester {
    public static void main(String[] args) {
        String zipFile = args[0];
        String unZipPath = args[1];
        Unzip myZip = new Unzip(zipFile, unZipPath);
        myZip.doUnZip();
    }
}
