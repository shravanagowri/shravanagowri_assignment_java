/* 4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/
package ass4a;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class HelloSwing {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Welcome Window");

        // Create a label with the message, center aligned
        JLabel label = new JLabel("Hello! VI B Shravana , Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font to Arial, plain style, size 32
        label.setFont(new Font("Arial", Font.PLAIN, 32));

        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Add the label to the frame
        frame.add(label);

        // Set frame size
        frame.setSize(700, 200);

        // Center the frame on screen
        frame.setLocationRelativeTo(null);

        // Close the application when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
