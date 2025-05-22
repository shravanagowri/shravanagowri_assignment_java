/* 5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.  */


package prog5;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;


	public class CountryCapitalList extends JFrame {

	    private JList<String> countryList;
	    private HashMap<String, String> capitals;

	    public CountryCapitalList () {
	        setTitle("Country Capital Viewer");
	        setSize(300, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        // Array of countries
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
	        };

	        // Map of capitals
	        capitals = new HashMap<>();
	        capitals.put("USA", "Washington D.C.");
	        capitals.put("India", "New Delhi");
	        capitals.put("Vietnam", "Hanoi");
	        capitals.put("Canada", "Ottawa");
	        capitals.put("Denmark", "Copenhagen");
	        capitals.put("France", "Paris");
	        capitals.put("Great Britain", "London");
	        capitals.put("Japan", "Tokyo");
	        capitals.put("Africa", "Addis Ababa");
	        capitals.put("Greenland", "Nuuk");
	        capitals.put("Singapore", "Singapore");

	        // Create JList
	        countryList = new JList<>(countries);
	        countryList.setVisibleRowCount(8);
	        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        // Add ListSelectionListener
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    String selectedCountry = countryList.getSelectedValue();
	                    if (selectedCountry != null) {
	                        String capital = capitals.get(selectedCountry);
	                        System.out.println("Capital of " + selectedCountry + " is: " + capital);
	                    }
	                }
	            }
	        });

	        // Add to frame
	        add(new JLabel("Select a Country:"));
	        add(scrollPane);

	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new CountryCapitalList ();
	    }
	}


