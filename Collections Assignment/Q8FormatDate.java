import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Q8FormatDate {
    public static void main(String[] args) {
        SimpleDateFormat sdt=new SimpleDateFormat("dd-MMMM-yyyy");
        sdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        String str=sdt.format(System.currentTimeMillis());
        System.out.println("Current date is: "+str);
    }
}
