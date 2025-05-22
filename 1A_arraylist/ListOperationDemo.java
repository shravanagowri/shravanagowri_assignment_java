*/1A.Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list*/
    
package ass1a;

import java.util.*;

public class ListOperationDemo {

    public static void main(String[] args) {
        // Declare and initialize the list (choose either ArrayList or LinkedList)
        List<String> fruits = new ArrayList<>(); // or new LinkedList<>();

        // 1. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("After adding elements: " + fruits);

        // 2. Adding element at specific index
        fruits.add(1, "Grapes");
        System.out.println("After adding 'Grapes' at index 1: " + fruits);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Mango", "Papaya");
        fruits.addAll(moreFruits);
        System.out.println("After adding multiple fruits: " + fruits);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + fruits.get(2));

        // 5. Updating elements
        fruits.set(2, "Kiwi");
        System.out.println("After updating index 2 to 'Kiwi': " + fruits);
        // 6. Removing elements
        fruits.remove("Banana");
        fruits.remove(0); // removes the first element
        System.out.println("After removing elements: " + fruits);
        // 7. Searching elements
        boolean containsMango = fruits.contains("Mango");
        System.out.println("List contains 'Mango': " + containsMango);
        // 8. List size
        System.out.println("List size: " + fruits.size());
        // 9. Iterating over list (using for-each loop)
        System.out.println("Iterating using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // 10. Using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // 11. Sorting
        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);
        // 12. Sublist
        if (fruits.size() >= 2) {
            List<String> subList = fruits.subList(0, 2);
            System.out.println("Sublist (0 to 2): " + subList);
        }
        // 13. Clearing the list
        fruits.clear();
        System.out.println("List after clearing: " + fruits);
    }
}
