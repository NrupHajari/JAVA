import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        int a[] = { 25, 12, 11, 2, 45, 78, 32, 45 };
        Scanner sc = new Scanner(System.in);
        System.out.println("enter search element : ");
        int search = sc.nextInt();
        boolean flag = false;

        for (int i = 0; i < a.length; i++) {
            if (search == a[i]) {
                System.out.println("this element in " + i + " th index");
                flag = true;
                break;
            }

        }

        if (!flag) {
            System.out.println("search element in not in array !");
        }
    }

}
