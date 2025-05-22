*/2B.Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/
package ass2b;

public class performanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iterations = 10000;
        String appendStr = "AIET";

        // Test with StringBuffer
        StringBuffer sbuffer = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbuffer.append(appendStr);
        }
        long endBuffer = System.nanoTime();
        long timeBuffer = endBuffer - startBuffer;
        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");

        // Test with StringBuilder
        StringBuilder sbuilder = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbuilder.append(appendStr);
        }
        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder - startBuilder;
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");

        // Conclusion
        if (timeBuilder < timeBuffer) {
            System.out.println("➡ StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("➡ StringBuffer is faster than StringBuilder.");
        }
	}

}
