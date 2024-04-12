import java.util.Scanner;

public class error_2 {
    public static void main(String[] args) {

        int[] marks = { 22, 66, 88 };

        Scanner sc = new Scanner(System.in);
        System.out.println("enter index of array");
        int index = sc.nextInt();

        System.out.println("enter number");
        int number = sc.nextInt();

        try {
            System.out.println("index of array is " + marks[index]);
            System.out.println("array devide by number is " + marks[index] / number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured !" + e);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured !" + e);
        } catch (Exception e) {
            System.out.println("some other Exception occured !" + e);
        }

    }

}
