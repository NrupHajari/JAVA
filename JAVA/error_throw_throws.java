
class NegativeException extends Exception {
    public String toString() {
        return "i am toString()";
    }

    public String getMessage() {
        return "i am getMessage()";
    }

    NegativeException(String s) {
        System.out.println(s);
    }
}

public class error_throw_throws {

    public static double area(int r) throws NegativeException {
        if (r < 0) {
            throw new NegativeException("lo bhai lo....");
        }

        double result = Math.PI * r * r;
        return result;
    }

    public static void main(String[] args) {

        try {
            double ar = area(-96);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println("exception error bro !");
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e); // toString print thay
            e.printStackTrace(); // not errpr but excute
            System.out.println("done");
        }

        finally {
            System.out.println("the program always execute finally block (exception handle or not handle )");
        }

    }

}
