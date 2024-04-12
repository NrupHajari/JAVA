import java.util.Scanner;

// public class sem4exampractice {

//     public static void main(String[] args) {
// int a, sum = 0;
// Scanner sc = new Scanner(System.in);
// System.out.println("enter 1... .........");
// while (true) {
// a = sc.nextInt();
// if (a == -1)
// break;

// sum = sum + a;

// }
// System.out.println(sum);

//     Scanner sc = new Scanner(System.in);
//     int[][] marks = new int[3][3];

//     for (int i = 0; i < 3; i++) {
//         for (int j = 0; j < marks[i].length; j++) {

//             marks[i][j] = sc.nextInt();
//         }

//     }
//     for (int i = 0; i < marks.length; i++) {
//         for (int j = 0; j < marks[i].length; j++) {
//             System.out.print(marks[i][j] + "  ");
//         }
//         System.out.println("");
//     }

// }

// }/

// class base {

//     base() {
//         System.out.println("i am base constructor ");
//     }

//     base(int x) {
//         System.out.println("i am overloading base constructor with value x : " + x);
//     }

// }

// class derive extends base {
//     derive() {
//         super(14);
//         System.out.println("i am derive constructor ");
//     }

//     derive(int x, int y) {
//         super(x);
//         System.out.println("i am overloading derive constructor with value y:  " + y);
//     }

// }

// class childOfderive extends derive {
//     childOfderive() {
//         super();
//         System.out.println("i am childOfderuive constructor ");
//     }

//     childOfderive(int x, int y, int z) {
//         super(x, y);
//         System.out.println("i am overloading childOfderive constructor with value z: " + z);
//     }
// }

// public class sem4exampractice {
//     public static void main(String[] args) {

//         // base b = new base();

//         // derive d = new derive();

//         // derive d = new derive(14, 9);

//         childOfderive c = new childOfderive();
//         // childOfderive c = new childOfderive(12, 44, 89);

//     }
// }

// class time {
//     int hour;
//     int minute;
//     int second;

//     time(int h, int m, int s) {
//         this.hour = h;
//         this.minute = m;
//         this.second = s;

//     }

//     void add(time tm) {

//         this.second += tm.second;
//         if (second >= 60) {
//             minute++;
//             second -= 60;
//         }
//         this.minute += tm.minute;
//         if (minute >= 60) {
//             hour++;
//             minute -= 60;
//         }

//         this.hour += tm.hour;

//     }

// }

// public class sem4exampractice {

//     public static void main(String[] args) {

//         time t1 = new time(2, 23, 56);
//         time tm = new time(3, 20, 14);
//         t1.add(tm);

//         System.out.println(t1.hour);
//         System.out.println(t1.minute);
//         System.out.println(t1.second);
//     }
// }

// class A {
//     protected int a;

//     A() {
//         System.out.println("hy...............");
//     }

//     void showA() {
//         System.out.println(a);
//     }
// }

// class B extends A {
//     int b;
//     int a;

//     void aa(int a, int b) {
//         this.a = a;
//         super.a = b;
//         System.out.println(super.a + " " + a);
//     }

//     void showb() {
//         System.out.println(super.a + " " + this.a);
//     }

// }

// public class sem4exampractice {
//     public static void main(String[] args) {
//         A a1 = new A();
//         a1.a = 50;
//         a1.showA();

//         B b1 = new B();
//         b1.b = 12;
//         b1.aa(40, 80);
//         // b1.a = 32;
//         b1.showb();

//     }
// }

// class distance {
//     int km;
//     int m;
//     int cm;

//     distance(int h, int m, int s) {
//         this.km = h;
//         this.m = m;
//         this.cm = s;

//     }

//     public distance add(distance tm) {

//         this.cm += tm.cm;
//         if (cm >= 100) {
//             m += cm / 100;
//             cm = this.cm % 100;
//         }
//         this.m += tm.m;
//         if (m >= 1000) {
//             km += m / 1000;
//             m = this.m % 1000;
//         }

//         this.km += tm.km;

//         return new distance(this.km, this.m, this.cm);

//     }

//     void display() {
//         System.out.println(km + " " + m + " " + cm);
//     }

// }

// public class sem4exampractice {

//     public static void main(String[] args) {

//         distance t1 = new distance(2, 230, 100);
//         distance tm = new distance(3, 700, 144);

//         t1.display();
//         tm.display();

//         distance sum = t1.add(tm);

//         System.out.println(t1.km);
//         System.out.println(t1.m);
//         System.out.println(t1.cm);

//         t1.display();
//         sum.display();

//     }
// }

public class sem4exampractice {

    public static void main(String[] args) {
        int balance = 5000;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Amount to withdraw");
        int withdraw = sc.nextInt();

        try {
            if (balance - withdraw < 1000) {
                throw new Exception("Balance must be grater than 1000");
            }

            else {
                balance = balance - withdraw;

            }

            // int a = balance / withdraw;

        }

        catch (Exception e) {
            System.out.println("hy............");
            System.out.println(e + "uggsagfjabfba" + e);
        }
    }
}