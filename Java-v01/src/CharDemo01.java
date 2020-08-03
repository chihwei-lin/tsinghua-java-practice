public class CharDemo01 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 65;       // ascii code

        System.out.println(c1);
        System.out.println(c2);

        c1 = '\n';      // breakline
        c1 = '\r';      // return
        c1 = '\b';      // backspace
        c1 = '\t';      // horizontal
        c1 = '\f';      // switch page
        c1 = '\'';
        c1 = '\"';
        c1 = '\\';
        c1 = '\101';        // use 3-digit octal number to represent 256 chars in 0~377
        c1 = '\u4e01';      // use 4-digit hexadecimal number to represent chars in \u0000 ~  \uffff
    }
}
