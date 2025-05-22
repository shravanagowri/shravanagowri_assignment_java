*/1B5:Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/
package ass1b5;
import java.util.ArrayList;
public class DeleteNthElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> colors = new ArrayList<>();

	        // Add some colors
	        colors.add("Red");     // index 0
	        colors.add("Green");   // index 1
	        colors.add("Blue");    // index 2
	        colors.add("Yellow");  // index 3
	        colors.add("Orange");  // index 4

	        // Display original list
	        System.out.println("Original color list: " + colors);

	        // Define the index (nth element) to remove
	        int n = 2; // Change this value to delete a different element (e.g., 0 for 1st)

	        // Check if index is valid
	        if (n >= 0 && n < colors.size()) {
	            String removedColor = colors.remove(n);
	            System.out.println("Removed color at index " + n + ": " + removedColor);
	        } else {
	            System.out.println("Invalid index: " + n);
	        }

	        // Display updated list
	        System.out.println("Updated color list: " + colors);
	}

}
