*/1C3.Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/
package ass1C3;
import java.util.LinkedList;
public class InsertAtEnd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<>();

        // Add initial elements
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Blue");

        // Display original list
        System.out.println("Original LinkedList: " + l_list);

        // Insert "Pink" at the end using offerLast()
        l_list.offerLast("Pink");

        // Display updated list
        System.out.println("LinkedList after inserting 'Pink' at the end: " + l_list);
	}

}
