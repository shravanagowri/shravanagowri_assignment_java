/*6c. Build a servlet program to check the given number is prime number or not using HTML with step
by step procedure.*/
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/PrimeCheckServlet")
public class PrimeCheckServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Get the input number from the form
            String numStr = request.getParameter("number");
            int number = Integer.parseInt(numStr);

            // Validate input
            if (number < 1) {
                out.println("<h3>Please enter a positive integer greater than 0.</h3>");
            } else {
                // Check if prime
                boolean isPrime = checkPrime(number);

                // Display result
                out.println("<html><body>");
                out.println("<h2>Prime Number Check Result</h2>");
                if (isPrime) {
                    out.println("<p>" + number + " is a <strong>prime</strong> number.</p>");
                } else {
                    out.println("<p>" + number + " is <strong>not</strong> a prime number.</p>");
                }
                out.println("<a href='primeCheck.html'>Try another number</a>");
                out.println("</body></html>");
            }
        } catch (NumberFormatException e) {
            out.println("<h3>Invalid input. Please enter a valid integer.</h3>");
        } finally {
            out.close();
        }
    }

    // Method to check if number is prime
    private boolean checkPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
