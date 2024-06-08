import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Utility {
    public static Hashtable<String, Object> mapDict = new Hashtable<>();
    private static final Random RANDOM = new Random();
    public static Date currentDate = new Date();
    public static Calendar cal = Calendar.getInstance();
    public static boolean isGivenDateTimeAfterNow(String dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        ZonedDateTime givenDateTime = ZonedDateTime.parse(dateTime, formatter);
        ZonedDateTime now = ZonedDateTime.now();
        return givenDateTime.isAfter(now);
    }
    public static String getDate (){
        cal.setTime(currentDate);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String currentDateString = formatter.format(currentDate);
        return currentDateString ;
    }
    public static void setValue(String key, Object value) {
        mapDict.put(key, value);
    }
    public static Object getValue(String key) {
        return mapDict.get(key);
    }
}
