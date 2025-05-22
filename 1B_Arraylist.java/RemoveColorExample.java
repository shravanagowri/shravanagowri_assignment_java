*/1B2.Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList*/
package ass1b2;
import java.util.ArrayList;
public class RemoveColorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList<>();

        // Add some colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display original list
        System.out.println("Original color list: " + colors);

        // Remove the 2nd element (index 1)
        if (colors.size() > 1) {
            String removedByIndex = colors.remove(1); // Removes "Green"
            System.out.println("Removed 2nd element: " + removedByIndex);
        }

        // Remove the color "Blue" by value
        boolean isBlueRemoved = colors.remove("Blue");
        if (isBlueRemoved) {
            System.out.println("Color 'Blue' removed from the list.");
        } else {
            System.out.println("Color 'Blue' was not found in the list.");
        }

        // Display updated list
        System.out.println("Updated color list: " + colors);
	}

}
