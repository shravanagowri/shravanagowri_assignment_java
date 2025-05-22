package ass1C5;
import java.util.LinkedList;
import java.util.Collections;
public class Swapelemntlinkedlist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> l_list = new LinkedList<>();

	        // Add elements
	        l_list.add("Red");     // index 0
	        l_list.add("Green");   // index 1
	        l_list.add("Blue");    // index 2
	        l_list.add("Yellow");  // index 3

	        // Display original list
	        System.out.println("Original LinkedList: " + l_list);

	        // Swap first and third elements (index 0 and 2)
	        Collections.swap(l_list, 0, 2);

	        // Display list after swapping
	        System.out.println("LinkedList after swapping first and third elements: " + l_list);
	}

}
