import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class date_time {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);

        Date d = new Date();

        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());

        // calendar in java

        System.out.println("calendar ............");

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());

        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020));
        System.out.println(gc.isLeapYear(2018));

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[282]);

        // local date and time

        System.out.println("local date & time ..............");

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // formate
        System.out.println("formate................");

        DateTimeFormatter fdt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fdt2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String mydate = ldt.format(fdt);
        String mydate2 = ldt.format(fdt2);

        System.out.println(mydate);
        System.out.println(mydate2);

    }

}
