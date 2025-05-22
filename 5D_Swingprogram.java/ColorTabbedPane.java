/* 5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan */


package prog5;
import javax.swing.*;
import java.awt.*;

public class ColorTabbedPane extends JFrame {

	    public ColorTabbedPane() {
	        setTitle("Color Tabbed Pane");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create Tabbed Pane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create panels for each color
	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);
	        tabbedPane.addTab("Cyan", cyanPanel);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);
	        tabbedPane.addTab("Magenta", magentaPanel);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);
	        tabbedPane.addTab("Yellow", yellowPanel);

	        // Add tabbedPane to frame
	        add(tabbedPane);

	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new ColorTabbedPane();
	    }
	}


