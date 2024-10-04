import java.util.Scanner;

public class TestBloodData {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String bloodType;
        String rhFactor;

        do {
            System.out.printf("Enter blood type (A, B, AB, O): ");
            bloodType = scan.next().toUpperCase();
        } while (isValidBloodType(bloodType));

        do {
            System.out.printf("Enter Rh factor (+ or -): ");
            rhFactor = scan.next();
        } while (isValidRhFactor(rhFactor));

        System.out.println("Blood type: " + bloodType + rhFactor);
    }

    private static boolean isValidBloodType(String bloodType) {
        return !(bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("AB") || bloodType.equals("O"));
    }

    private static boolean isValidRhFactor(String rhFactor) {
        return !(rhFactor.equals("+") || rhFactor.equals("-"));
    }
}
