package ass3b1;
import java.util.Scanner;
public class NullOrEmptyCheck {
    // User-defined method to check null or empty (whitespace only)
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isNullOrEmpty(input)) {
            System.out.println("The string is either null or contains only whitespace.");
        } else {
            System.out.println("The string is not null and contains non-whitespace characters.");
        }

        scanner.close();
	}
}
