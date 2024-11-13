import java.util.Scanner;

public class SpoonerismGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpoonerismGenerator generator = new SpoonerismGenerator();
        
        int choice;
        do {
            generator.execute();
            System.out.println("\nWant to try again? (1)Yes (2)No");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
        } while (choice == 1);
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Word 1: ");
        String wordOne = scanner.nextLine().toLowerCase();
        
        System.out.print("Word 2: ");
        String wordTwo = scanner.nextLine().toLowerCase();
        
        int posOne = findFirstVowelIndex(wordOne);
        int posTwo = findFirstVowelIndex(wordTwo);

        if (posOne <= 0 || posTwo <= 0) {
            System.out.println("\n" + wordOne + " and " + wordTwo + " are not good words to spoonerize.");
            return;
        }

        String spoonerizedOne = wordTwo.substring(0, posTwo) + wordOne.substring(posOne);
        String spoonerizedTwo = wordOne.substring(0, posOne) + wordTwo.substring(posTwo);
        
        System.out.println("\n" + wordOne + " and " + wordTwo + " spoonerized are " + spoonerizedOne + " " + spoonerizedTwo);
    }

    private int findFirstVowelIndex(String word) {
        String vowels = "aeiou";
        for (int i = 1; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; 
    }
}
