import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        int a[] = { 12, 23, 28, 45, 65, 84, 91 }; // in binary search element in order in maintain in array
        Scanner sc = new Scanner(System.in);
        System.out.println("enter search element : ");
        int search = sc.nextInt();
        boolean flag = false;

        int high = a.length - 1;
        int low = 0;

        while (high >= low) {
            int mid = (high + low) / 2;
            if (a[mid] == search) {
                System.out.println("this element in " + mid + " th index");
                flag = true;
                break;
            }

            else if (search > a[mid]) {
                low = mid + 1;
            }

            else if (search < a[mid]) {
                high = mid - 1;
            }
        }

        if (!flag) {
            System.out.println("search element in not in array !");
        }

    }

}
