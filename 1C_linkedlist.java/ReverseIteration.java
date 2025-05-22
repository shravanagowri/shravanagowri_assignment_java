package ass1C2;
import java.util.LinkedList;
import java.util.Iterator;
public class ReverseIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> colors = new LinkedList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Display original list
        System.out.println("Original color list: " + colors);

        // Use descendingIterator() to iterate in reverse order
        System.out.println("Iterating in reverse order:");
        Iterator<String> reverseIterator = colors.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
	}

}
