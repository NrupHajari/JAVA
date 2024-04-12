import java.util.ArrayList;

public class collectonOfFramework_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(6);
        l1.add(8);

        l1.add(0, 4); // 0 index pr 4 element avi jay
        l1.add(0, 3); // have 0 index pr 3 avi jay pachhi 4 pachhi 5 e rite array banse

        l2.add(12);
        l2.add(13);
        l2.add(14);

        l1.addAll(0, l2); // l1 ma badha l2 na element avi jay with index 0 to...

        l1.set(9, 1); // 9 index pr 1 element add karyu(8 element ne remove kari ne)

        // l1.clear(); // arraylist clear khali thai jase

        System.out.println("l1 length size = " + l1.size()); // array in length batave

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)); // array ma l1[i] aave e rite l1.get(i)
            System.out.print(" , ");

        }
        System.out.println();

        System.out.println(l1.contains(14));
        System.out.println(l1.contains(77)); // arraylist ma che k nai check kare

        System.out.println(l1.indexOf(14));
        System.out.println(l1.indexOf(77)); // arraylist ma kaya index pr che e batave
        System.out.println(l1);

    }

}
