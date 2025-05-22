package ass2a;

public class StringOperationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String str4 = "Java programming is fun";
        System.out.println("Index of 'programming': " + str4.indexOf("programming"));
        System.out.println("Contains 'fun': " + str4.contains("fun"));

        // 5. Substring Operations
        System.out.println("Substring (5 to 16): " + str4.substring(5, 16));

        // 6. String Modification
        String replaced = str4.replace("fun", "awesome");
        System.out.println("After replacement: " + replaced);

        // 7. Whitespace Handling
        String str5 = "   Trim me   ";
        System.out.println("Before trim: '" + str5 + "'");
        System.out.println("After trim: '" + str5.trim() + "'");

        // 8. String Concatenation
        String concatStr = str1 + " " + str2;
        System.out.println("Concatenated string: " + concatStr);

        // 9. String Splitting
        String csv = "apple,banana,orange";
        String[] fruits = csv.split(",");
        System.out.println("Split string:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to Java");
        sb.insert(0, ">>> ");
        sb.replace(0, 3, "***");
        sb.delete(0, 3);
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Shravana Gowri";
        int age = 21;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Validate Email using contains(), startsWith(), endsWith()
        String email = "shravanagowri0@gmail.com";
        boolean isValid = email.contains("@") && email.endsWith(".com") && !email.startsWith("@");
        System.out.println("Email: " + email);
        System.out.println("Is valid email: " + isValid);
	}

}
