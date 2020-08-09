import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTester {
    public static void main(String[] args) {
        String[] num = {"one", "two", "three", "four"};

        List<String> aList = new ArrayList<String>(Arrays.asList(num));

        System.out.println("Before List: " + aList);

        // List 接口继承 集合接口，集合接口继承 Iterable 接口
        // aList 调用 iterator 方法
        Iterator<String> nums = aList.iterator();
        while(nums.hasNext()){
            String aString = (String)nums.next();
            System.out.println(aString);
            if(aString.length()>4) nums.remove();
        }
        System.out.println("After List: "+aList);
    }
}
