*/1C1.Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
package ass1C1;
import java.util.LinkedList;
import java.util.ListIterator;
public class IterateFromSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> colors = new LinkedList<>();

        // Add elements
        colors.add("Red");     // index 0
        colors.add("Green");   // index 1
        colors.add("Blue");    // index 2
        colors.add("Yellow");  // index 3
        colors.add("Orange");  // index 4

        // Display the full list
        System.out.println("Full color list: " + colors);

        // Create a ListIterator starting at index 1 (2nd position)
        ListIterator<String> iterator = colors.listIterator(1);

        // Iterate from the 2nd element onwards
        System.out.println("Iterating from 2nd position:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

	}

}
