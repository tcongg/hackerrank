import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.text.ParseException;
import java.util.Scanner;

class Solution {

    public static String getDay(String day, String month, String year) {
        String dateString = String.format("%s-%s-%s", year, month, day);
        
        Date date = new Date();
        try {
            date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
        } catch (Exception e) {
        }
        
        String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
        
        return dayOfWeek.toUpperCase();      
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}