public class error {
    public static void main(String[] args) {

        // syntax error
        // int a = 5 //--> no semicolon then error throw
        // System.out.println(a);

        // try catch handle exception

        int a = 400;
        int b = 0;

        // without try

        /*
         * int c = a / b;
         * System.out.println("he result is : " + c); // --> error thorw devide zero
         * 
         * System.out.println("program finidhed "); --> this line not print (java line
         * by line excute when before line error then program after linr not work)
         * 
         */

        // with try

        try {
            int c = a / b;
            System.out.println("he result is : " + c);
        } catch (Exception e) {
            System.out.println("failed devision ");
            System.out.println(e);
        }

        System.out.println("program finished");
    }

}
