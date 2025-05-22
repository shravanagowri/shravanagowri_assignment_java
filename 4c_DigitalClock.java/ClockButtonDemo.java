/* 4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).
 */

package prog4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


	public class ClockButtonDemo extends JFrame implements ActionListener {

	    private JButton digitalClockButton;
	    private JButton hourGlassButton;
	    private JLabel messageLabel;

	    public ClockButtonDemo () {
	        setTitle("Clock Selector");
	        setSize(400, 300);
	        setLayout(new FlowLayout());
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Load images (use your own image paths or URLs)
	        ImageIcon digitalIcon = new ImageIcon("C:\\Users\\manoh\\Downloads\\p1.png");
	        ImageIcon hourGlassIcon = new ImageIcon("C:\\Users\\manoh\\Downloads\\p2.jpeg");

	        // Create buttons with icons
	        digitalClockButton = new JButton(digitalIcon);
	        hourGlassButton = new JButton(hourGlassIcon);

	        // Add action listeners
	        digitalClockButton.addActionListener(this);
	        hourGlassButton.addActionListener(this);

	        // Label to show messages
	        messageLabel = new JLabel("Click a button...");

	        // Add components to frame
	        add(digitalClockButton);
	        add(hourGlassButton);
	        add(messageLabel);

	        setVisible(true);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == digitalClockButton) {
	            messageLabel.setText("Digital Clock is pressed");
	        } else if (e.getSource() == hourGlassButton) {
	            messageLabel.setText("Hour Glass is pressed");
	        }
    }

	    public static void main(String[] args) {
	        new ClockButtonDemo ();
	    }
	}


