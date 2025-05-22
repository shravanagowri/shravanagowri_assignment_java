package ass3b4;
import java.util.Scanner;
public class palindromeChecker {
	// Function to check if a string is a palindrome (ignoring case and punctuation)
    public static boolean isPalindrome(String str) {
        if (str == null) return false;

        // Remove all non-alphanumeric characters and convert to lower case
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
	}

}
