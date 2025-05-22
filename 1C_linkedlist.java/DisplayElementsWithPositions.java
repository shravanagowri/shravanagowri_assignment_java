*/1C4:Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/
package ass1C4;
import java.util.LinkedList;
public class DisplayElementsWithPositions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<>();

        // Add elements
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Blue");
        l_list.add("Yellow");
        l_list.add("Orange");

        // Display elements with their positions
        System.out.println("Elements and their positions in the LinkedList:");
        for (int i = 0; i < l_list.size(); i++) {
            System.out.println("Position " + i + ": " + l_list.get(i));
        }
	}

}
