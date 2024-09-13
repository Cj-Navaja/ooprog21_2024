import java.util.Scanner;

public class SammysRentalPrice {

    public static void main(String[] args) {
        final float HOURLY_RATE = 40.0f;
        final float ADDITIONAL_MINUTE_RATE = 1.0f;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of mins. : ");
        int rentalDuration = userInput.nextInt();

      
        int fullHours = rentalDuration / 60;
        int extraMinutes = rentalDuration % 60;

      
        float totalRentalCost = (fullHours * HOURLY_RATE) + (extraMinutes * ADDITIONAL_MINUTE_RATE);

      
        System.out.println("\nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S       Sammy's makes it fun in the sun.       S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

       
        System.out.println("\n Time:");
        System.out.println("Number of Hours: " + fullHours);
        System.out.println("Number of Minutes: " + extraMinutes);
        System.out.printf("Total Rental Price: $%.2f\n", totalRentalCost); // Use printf for consistent decimal formatting
    }
}
