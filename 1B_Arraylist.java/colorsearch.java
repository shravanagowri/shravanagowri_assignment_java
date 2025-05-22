package ass1b;
import java.util.ArrayList;
public class colorsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Purple");

        // Display the colors
        System.out.println("Available colors: " + colors);

        // Search for "Red"
        if (colors.contains("Red")) {
            System.out.println("The color 'Red' is available in the list.");
        } else {
            System.out.println("The color 'Red' is NOT available in the list.");
        }

	}

}
