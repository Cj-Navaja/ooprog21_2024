import java.util.Scanner;

public class Palindrome { 
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a string: "); 
        String originalText = inputScanner.nextLine();
        
        String resultMessage = checkPalindrome(originalText) 
            ? "This is a palindrome." 
            : "This is not a palindrome.";
        
        System.out.println(resultMessage);    
    }
    
    public static boolean checkPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;
        
        while (left < right) {
            if (Character.toLowerCase(text.charAt(left)) != Character.toLowerCase(text.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
