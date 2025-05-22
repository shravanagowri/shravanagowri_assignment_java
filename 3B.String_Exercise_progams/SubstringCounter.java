*/3B2:Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/
package ass3b2;
import java.util.Scanner;
public class SubstringCounter {
	// Function to count occurrences of 'sub' in 'mainStr'
    public static int countOccurrences(String mainStr, String sub) {
        if (mainStr == null || sub == null || sub.isEmpty()) {
            return 0;  // Defensive check
        }

        int count = 0;
        int index = 0;

        // Loop until no more occurrences found
        while ((index = mainStr.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();  // Move past the current occurrence
        }

        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();

        System.out.print("Enter the substring to count: ");
        String subString = sc.nextLine();

        int occurrences = countOccurrences(mainString, subString);
        System.out.println("Substring '" + subString + "' appears " + occurrences + " times in the main string.");

        sc.close();
	}

}
