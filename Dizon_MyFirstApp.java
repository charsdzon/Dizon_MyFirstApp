import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintNameAndDateTime {
    public static void main(String[] args) {
        // Print your full name
        String fullName = "Charles Mathew Dizon";
        System.out.println("Full Name: " + fullName);

        // Get and display the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}
