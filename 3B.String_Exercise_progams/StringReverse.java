*/3B3:Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
package ass3b3;
import java.util.Scanner;
public class StringReverse {
	public static String reverseString(String str) {
        if (str == null) return null;

        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        String reversedString = reverseString(input);
        System.out.println("Reversed string: " + reversedString);

        sc.close();
	}

}
