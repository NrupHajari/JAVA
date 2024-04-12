import java.util.LinkedList;

public class collectionOfFramework_linkedlis {
    public static void main(String[] args) {

        // same Arraylist and LinkedList (some method differnt)

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(6);
        l1.add(8);

        l1.add(0, 4);
        l1.add(0, 3);

        l2.add(12);
        l2.add(13);
        l2.add(14);

        l1.addAll(0, l2);

        l1.set(9, 1);

        l1.addLast(789);
        l1.addFirst(123); // aa method LInkedlist ma j che

        // l1.clear();

        System.out.println("l1 length size = " + l1.size());

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(" , ");

        }
        System.out.println();

        System.out.println(l1.contains(14));
        System.out.println(l1.contains(77));

        System.out.println(l1.indexOf(14));
        System.out.println(l1.indexOf(77));
    }

}
