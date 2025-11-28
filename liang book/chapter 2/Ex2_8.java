import java.util.Scanner;
public class Ex2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the time zone :");

        int timeZoneOffset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + timeZoneOffset) % 24;

        System.out.println("Current time in the specified time zone is: " +
                currentHour + ":" + currentMinute + ":" + currentSecond);


    }
}
