/*6b. Build a servlet program to create a cookie to get your name through text box and press submit
button( through HTML) to display the message by greeting Welcome back your name ! , you have
visited this page n times ( n = number of your visit ) and demonstrate the expiry of cookie also.
*/
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        if (username == null || username.trim().isEmpty()) {
            out.println("<h3>Please enter a valid name.</h3>");
            return;
        }

        // Default visit count
        int visitCount = 1;
        boolean found = false;

        // Get all cookies from the request
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) {
                    // If username cookie exists, use its value instead of new input
                    username = c.getValue();
                    found = true;
                }
                if (c.getName().equals("visitCount")) {
                    try {
                        visitCount = Integer.parseInt(c.getValue());
                    } catch (NumberFormatException e) {
                        visitCount = 0;
                    }
                }
            }
        }

        if (found) {
            visitCount++;
        }

        // Create or update cookies
        Cookie userCookie = new Cookie("username", username);
        Cookie visitCookie = new Cookie("visitCount", Integer.toString(visitCount));

        // Set expiry to 60 seconds (1 minute)
        userCookie.setMaxAge(60);
        visitCookie.setMaxAge(60);

        // Add cookies to response
        response.addCookie(userCookie);
        response.addCookie(visitCookie);

        // Display welcome message
        out.println("<html><body>");
        out.println("<h2>Welcome back, " + username + "!</h2>");
        out.println("<p>You have visited this page " + visitCount + " time(s).</p>");
        out.println("<p><i>Note: Cookies expire in 1 minute.</i></p>");
        out.println("<a href='index.html'>Go back</a>");
        out.println("</body></html>");
    }
}
