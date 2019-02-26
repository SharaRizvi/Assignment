import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Q9DifferentCountryFormats {
    public static void main(String[] args) {
        Date today=new Date();
        Locale[] locales={Locale.FRANCE,Locale.GERMANY,Locale.US,Locale.UK};
        int[] styles={DateFormat.SHORT,DateFormat.MEDIUM,DateFormat.LONG,DateFormat.FULL};
        String[] styleNames={"SHORT","MEDIUM","LONG","FULL"};
        DateFormat fmt;
        for (Locale locale:locales){
            System.out.println("\n\n"+locale.getDisplayCountry()+": ");
            for(int style:styles){
                fmt=DateFormat.getDateInstance(style,locale);
                System.out.print("\n\t"+styleNames[3-style]+": "+fmt.format(today));
            }
        }
    }
}
