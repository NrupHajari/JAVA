public class method_overloading {
    static void telljoke() { // void return type
        System.out.println("ha ha ha nice joke ");
    }

    static void change(int a) {
        a = 99;
    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }

    // same name foe methode but perameter juda

    static void foo() {
        System.out.println("hyy good morning patel");
    }

    static void foo(int a) { // a is parameter
        System.out.println("hyy good morning " + a + " patel");
    }

    static void foo(int a, int b) { // a amd b is parameter
        System.out.println("hyy good morning " + a + " patel ");
        System.out.println("hyy kano " + b + " nrup");
    }

    public static void main(String[] args) {
        /* telljoke(); */

        // changing the integer
        int x = 66; // x is object . object direct chnage method jai ne change na thai sake
        change(x); // change nai thay because x=66 ni copy change method ma jay
        System.out.println("the retur x after changing is : " + x); // the value of main method will not change

        // changing the array

        int[] marks = { 52, 85, 66, 73, 98 }; // marks is refernce and {...} is object. refernce change2 method ma gayo
                                              // che atle e refernce na object change thai sake
        System.out.println("before changing array " + marks[0]);
        change2(marks);
        System.out.println("the change value of array is: " + marks[0]);

        // refernce is passed in methode & refernce object pass. but direct object not
        // pass in methode .

        // method over loading

        foo();
        foo(100); // 100 is arguments
        foo(20, 50); // 20 and 50 is arguments
        // arguments is actual !

    }

}
