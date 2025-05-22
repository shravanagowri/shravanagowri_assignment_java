*/1B4:Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
package ass1b4;
import java.util.ArrayList;
import java.util.List;
public class ExtraxtSublist {
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

        // Extract 1st and 2nd elements using subList (index 0 to 2)
        List<String> subColors = colors.subList(0, 2);

        // Display sublist
        System.out.println("Extracted sublist (1st and 2nd elements): " + subColors);

	}

}
