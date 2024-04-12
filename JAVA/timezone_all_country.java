import java.util.TimeZone;

public class timezone_all_country {
    public static void main(String[] args) {

        String[] id = TimeZone.getAvailableIDs();
        System.out.println("ids in all countries");

        for (int i = 0; i < id.length; i++) {
            System.out.println(i + " = " + id[i]);
        }
    }

}
