import java.util.Scanner;

public class SammysRentalPrice {

    public static void main(String[] args) {
        final float HOURLY_RATE = 40.0f;
        final float ADDITIONAL_MINUTE_RATE = 1.0f;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the no. of mins. the equipment was rented: ");
        int rentalDuration = userInput.nextInt();

        // Calculate full hours and extra minutes (unchanged)
        int fullHours = rentalDuration / 60;
        int extraMinutes = rentalDuration % 60;

        // Calculate total rental cost (unchanged)
        float totalRentalCost = (fullHours * HOURLY_RATE) + (extraMinutes * ADDITIONAL_MINUTE_RATE);

        // Display motto and border after calculations
        System.out.println("\nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S  Sammy's makes it fun in the sun.          S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        // Display rental time details (unchanged)
        System.out.println("\nRental Time:");
        System.out.println("Hours: " + fullHours);
        System.out.println("Minutes: " + extraMinutes);
        System.out.printf("Total Rental Price: $%.2f\n", totalRentalCost); // Use printf for consistent decimal formatting
    }
}
