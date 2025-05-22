package ass4b;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CountryButtonDemo {
	public class CountryButtoDemo extends JFrame implements ActionListener {

	    JButton indiaButton, srilankaButton;
	    JLabel messageLabel;

	    public void CountryButtonDemo() {
	        // Set up frame
	        setTitle("Country Button Demo");
	        setSize(400, 200);
	        setLayout(new FlowLayout());
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null); // Center the frame

	        // Create buttons
	        indiaButton = new JButton("India");
	        srilankaButton = new JButton("Srilanka");

	        // Create label
	        messageLabel = new JLabel("Click a country button");
	        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));

	        // Add ActionListeners
	        indiaButton.addActionListener(this);
	        srilankaButton.addActionListener(this);

	        // Add components to frame
	        add(indiaButton);
	        add(srilankaButton);
	        add(messageLabel);

	        setVisible(true);
	    }

	    // Handle button events
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == indiaButton) {
	            messageLabel.setText("India is pressed");
	        } else if (e.getSource() == srilankaButton) {
	            messageLabel.setText("Srilanka is pressed");
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CountryButtonDemo();
	}

}
}
