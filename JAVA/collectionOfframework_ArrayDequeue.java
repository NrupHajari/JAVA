import java.util.ArrayDeque;

public class collectionOfframework_ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq1 = new ArrayDeque<>();

        dq1.add(5);
        dq1.add(6);
        dq1.add(7);
        dq1.add(8);
        dq1.addFirst(4);

        System.out.println(dq1.getFirst());
        System.out.println(dq1.getLast());

    }

}
