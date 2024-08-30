import java.util.Scanner;

public class WeekendDreams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Is it Saturday or Sunday? (true/false): ");
        boolean isWeekend = scanner.nextBoolean();

      
        System.out.print("Are you on vacation? (true/false): ");
        boolean onVacation = scanner.nextBoolean();

       
        boolean canSleepIn = isWeekend || onVacation;

       
        System.out.println(canSleepIn ? "Sweet dreams! You can sleep in." : "Time to rise and shine!");

        scanner.close();
    }
}
