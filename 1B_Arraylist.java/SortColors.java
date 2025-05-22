package ass1b3;
import java.util.ArrayList;
import java.util.Collections;
public class SortColors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> colors = new ArrayList<>();

	        // Add some color names
	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display original list
	        System.out.println("Original color list: " + colors);

	        // Sort the ArrayList using Collections.sort()
	        Collections.sort(colors);

	        // Display the sorted list
	        System.out.println("Sorted color list: " + colors);
	}

}
