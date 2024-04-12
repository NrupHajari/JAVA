public class method_function {

    static int logic(int x, int y) { // static use kaarvu pade atle main class ma aa function/methos mali rahe
        int z; // static use na karvu hoy hoy to niche method apeli che (method invocation
               // using Object creation)
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }

        return z;

    }

    public static void main(String[] args) {

        int a1 = 5;
        int b1 = 7;
        int c;
        // method invocation using Object creation
        // method_function obj = new method_function(); // static use na karvu hoy to aa
        // rite lakhay
        // c = obj.logic(a1, b1);
        c = logic(a1, b1);
        System.out.println(c);

        int a2 = 2;
        int b2 = 1;
        int c2;
        c2 = logic(a2, b2);
        System.out.println(c2);

    }

}
