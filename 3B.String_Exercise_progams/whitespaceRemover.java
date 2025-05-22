*/3B5:Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/
package ass3b5;
import java.util.Scanner;
public class whitespaceRemover {
	// User-defined function to remove all whitespace characters
    public static String removeWhitespace(String str) {
        if (str == null) return null;

        // Use regex to remove all types of whitespace (spaces, tabs, newlines, etc.)
        return str.replaceAll("\\s+", "");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with whitespaces: ");
        String input = scanner.nextLine();

        String result = removeWhitespace(input);
        System.out.println("String after removing whitespaces: " + result);

        scanner.close();
	}

}
