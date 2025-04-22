package week6;
// week 5 : Day 3: Wednesday
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter; // Formats time in specified pattern

public class JavaDate {
    public static void main(String[] args) {
        // Get the current date
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date: " + localDate); // Gives

        // Get the current time
        LocalTime localTime = LocalTime.now();
        System.out.println("Current Time: " + localTime);

        // Get the current date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + localDateTime);

        // Format DateTime using a specific pattern
        /* Similarly, here we used .ofPattern() method of class "DateTimeFormatter" which takes String as pattern, and return output like this:
            OUTPUT:
                Value(YearOfEra,4,19,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)' 'Value(HourOfDay,2)':'Value(MinuteOfHour,2)':'Value(SecondOfMinute,2)

         - we store it in reference variable, then use .format of localDatetime object we created and pass that formatter value there.
         - now, we get a formattedDateTime which we formatted using the value we get from formatter, and displayed it in console
        */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        System.out.println(formatter);
        String formattedDateTime = localDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}