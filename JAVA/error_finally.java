public class error_finally {
    public static void main(String[] args) {

        int a = 100;
        int b = 5;
        while (true) {

            try {

                int c = a / b;
                System.out.println(c);

            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("the program is finally and b is " + b);

            }
            b--;
        }
    }
}