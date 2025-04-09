package week5;

// week 5 : Day 3: Wednesday

import java.time.LocalDate; // LocalDate gives date in format: YYYY-MM-DD
import java.time.LocalDateTime; // LocalDateTime gives Date and Time in format: YYYY-MM-DDTHH:MM:SS.miliseconds , time in T24 hr format
import java.time.LocalTime; // Time in 24 hour format: HH:MM:SS.miliseconds
import java.time.format.DateTimeFormatter; // Formats time in specified pattern

public class JavaDate {
    public static void main(String[] args) {
        // Get the current date
        // LocalDate is a class, now() is a static method that returns an object of type "LocalDate"
        // So, here we created an object using LocalDate class, and LocalDate.now() method that returns current date
        // And, then we stored it in reference variable localdate.
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date: " + localDate); // Gives

        // Get the current time
        LocalTime localTime = LocalTime.now();
        System.out.println("Current Time: " + localTime);

        // Get the current date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + localDateTime);

        // Format DateTime using a specific pattern
        // Similarly, here we used .ofPattern() method of class "DateTimeFormatter" which takes String as pattern, and return output like this
        // Value(YearOfEra,4,19,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)' 'Value(HourOfDay,2)':'Value(MinuteOfHour,2)':'Value(SecondOfMinute,2)
        // we store it in reference variable, then use .format of localDatetime object we created and pass that formatter value there.
        // now, we get a formattedDateTime which we formatted using the value we get from formatter, and displayed it in console
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        System.out.println(formatter);
        String formattedDateTime = localDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}