*/3C6:Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/
package ass3C6;
import java.util.Scanner;
public class CaptialWord {
	// User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) return str;

        String[] words = str.trim().split("\\s+"); // split by whitespace
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter and add rest of the word
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1).toLowerCase())
                           .append(" ");
            }
        }

        return capitalized.toString().trim(); // Remove trailing space
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String output = capitalizeWords(input);
        System.out.println("Capitalized sentence: " + output);

        scanner.close();
	}

}
