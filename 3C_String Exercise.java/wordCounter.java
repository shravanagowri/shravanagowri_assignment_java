/*3c 10.Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/
package ass3C10;
import java.util.Scanner;
public class wordCounter {
	// User-defined function to count words in a string
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split the string by one or more spaces using regex
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);

        scanner.close();
	}

}
