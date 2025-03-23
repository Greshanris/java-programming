

public class RestaurantReservationSystem {
    // checkAvailability method takes a date as input and returns whether a table is available
    // reservationArr = {"2025-01-21", "2025-01-23", "2025-01-24", "2025-01-29"}
    // bookedArr = {"2025-01-21", "2025-01-23"}

    // Also, implement a method to validate user input in a login system

    public static void checkAvailability(String date) {
        String[] reservationArr = {"2025-01-21", "2025-01-23", "2025-01-24", "2025-01-29"};
        String[] bookedArr = {"2025-01-21", "2025-01-23"};

        boolean isReservable = false;
        for (String reservedDate : reservationArr) {
            if (reservedDate.equals(date)) {
                isReservable = true;
                break;
            }
        }

        if (!isReservable) {
            System.out.println("No reservation available");
        }

        for (String bookedDate : bookedArr) {
            if (bookedDate.equals(date)) {
                System.out.println("Table is already booked by other on " + date);
            } else {

                System.out.println("Table is booked for you on " + date);
            }
        }
    }

    public static void main(String[] args) {
        checkAvailability("2025-01-23");
    }
}
