/*6a. Build a servlet program to find the factorial of a number using HTML with step by step
procedure.*/
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Handles POST request
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Set content type to HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Read number parameter from the form
            String numStr = request.getParameter("number");
            int number = Integer.parseInt(numStr);

            if (number < 0) {
                out.println("<h3>Error: Please enter a non-negative integer.</h3>");
            } else {
                // Calculate factorial
                long factorial = calculateFactorial(number);

                // Output the result
                out.println("<html><body>");
                out.println("<h2>Factorial Result</h2>");
                out.println("<p>Factorial of " + number + " is: <strong>" + factorial + "</strong></p>");
                out.println("<a href='factorial.html'>Calculate Again</a>");
                out.println("</body></html>");
            }
        } catch (NumberFormatException e) {
            out.println("<h3>Error: Invalid input. Please enter a valid integer.</h3>");
        } finally {
            out.close();
        }
    }

    // Factorial calculation method
    private long calculateFactorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
