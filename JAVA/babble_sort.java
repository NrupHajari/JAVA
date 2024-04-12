public class babble_sort {
    public static void main(String[] args) {
        int a[] = { 5, 3, 7, 1, 6, 2, 9, 8, 4 };
        System.out.println("stsrt babble sort.........");

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {

                if (a[j] > a[j + 1]) {
                    // swap
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int temp : a) {
            System.out.print(temp + ",");
        }
    }

}
