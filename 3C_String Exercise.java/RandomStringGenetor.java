/*3c 9.Write a Java Program for Creating a random string of a 
specified length using user defined function generateRandomString()
*/
package ass3C9;
import java.util.Random;
import java.util.Scanner;
public class RandomStringGenetor {
	// User-defined function to generate a random string
    public static String generateRandomString(int length) {
        if (length <= 0) return "";

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the random string: ");
        int length = scanner.nextInt();

        String randomString = generateRandomString(length);
        System.out.println("Generated Random String: " + randomString);

        scanner.close();
	}

}
