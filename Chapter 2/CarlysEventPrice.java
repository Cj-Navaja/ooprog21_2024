import java.util.InputMismatchException;
import java.util.Scanner;

public class CarlysEventPrice {

    public static final double PRICE_PER_PERSON = 35.0; // Use double for wider number range

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to Carly's Party Planning!");
            System.out.println("Let's help you estimate the cost of your event.");
            System.out.print("Enter the number of guests: ");

            int numberOfGuests = scanner.nextInt();

            double totalCost = calculateTotalCost(numberOfGuests);

            
            displayCompanyMotto();

            System.out.println("\n**Event Details:**");
            System.out.println("  Number of Guests: " + numberOfGuests);
            System.out.printf("  Price Per Guest: $%.2f\n", PRICE_PER_PERSON); // Use printf for consistent formatting
            System.out.printf("  Total Price: $%.2f\n", totalCost);

            System.out.println("\n**Event Size Status:**");
            System.out.println("  Is the event considered large? " + (numberOfGuests >= 50 ? "true" : "false"));
        } catch (InputMismatchException e) {
            System.err.println("Invalid input: Please enter a whole number for the number of guests.");
        }
    }

    public static double calculateTotalCost(int numberOfGuests) {
        return numberOfGuests * PRICE_PER_PERSON;
    }

    public static void displayCompanyMotto() {
        System.out.println("*********************************************");
        System.out.println("*    Carly's makes the food that makes      *");
        System.out.println("*            it a party.                    *");
        System.out.println("*********************************************");
    }
}
