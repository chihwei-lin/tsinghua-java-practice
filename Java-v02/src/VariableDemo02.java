public class VariableDemo02 {
    // variables are bind in a block
    // when the block ends, life cycle of variables end

    public static void main(String[] args) {
        int x = 10;
        {
            int y = 20;
            System.out.println(x + y);
        }
//        System.out.println(x + y);        // y's life cycle was end at the above line
    }
}
