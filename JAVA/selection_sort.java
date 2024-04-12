public class selection_sort {
    public static void main(String[] args) {
        int a[] = { 5, 3, 7, 1, 6, 2, 9, 8, 4 };
        System.out.println("stsrt selection sort.........");

        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i];
            int minIndex = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minIndex = j;
                }

            }
            if (minIndex != i) {
                a[minIndex] = a[i];
                a[i] = min;

            }

        }

        for (int temp : a) {
            System.out.print(temp + ",");
        }
    }
}