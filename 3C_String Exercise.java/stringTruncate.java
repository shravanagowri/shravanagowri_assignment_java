*/3C7:Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
package ass3C7;
import java.util.Scanner;
public class stringTruncate {
	 // User-defined function to truncate a string and add ellipsis
    public static String truncate(String str, int maxLength) {
        if (str == null || maxLength < 0) {
            return null;
        }

        // If string is shorter or equal to maxLength, return it as is
        if (str.length() <= maxLength) {
            return str;
        }

        // If maxLength is less than or equal to 3, return only dots
        if (maxLength <= 3) {
            return "...".substring(0, maxLength);
        }

        // Truncate and add ellipsis
        return str.substring(0, maxLength - 3) + "...";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter maximum length: ");
        int length = scanner.nextInt();

        String result = truncate(input, length);
        System.out.println("Truncated string: " + result);

        scanner.close();
	}

}
