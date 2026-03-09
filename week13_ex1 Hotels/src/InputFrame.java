import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class InputFrame extends JFrame {
	
	private JPanel panel;
	private JPanel diamoniPanel;
	private JPanel allInclusivePanel;
	private JPanel buttonPanel;
	
	private JLabel diamoniLabel;
	private JLabel hotelLabel;
	private JLabel allInclusiveLabel;
	
	private JList listView;
	private DefaultListModel model;
	
	private JTextField daysField;
	private JTextField mealsField;
	
	private JButton storeButton;
	private JButton calculateCostButton;
	
	private JTextField costField;


	
	public InputFrame() {
		
		panel = new JPanel();
		diamoniPanel = new JPanel();
		allInclusivePanel = new JPanel();
		buttonPanel = new JPanel();	
		
		listView = new JList();
		model = new DefaultListModel();
		
		String fileName = "hotels.ser";
		try{
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
			ArrayList<Hotel> hotels = (ArrayList<Hotel>) inputStream.readObject();
			Collections.sort(hotels, (h1, h2) -> h1.getName().compareTo(h2.getName()));
			for (Hotel h: hotels){
				model.addElement(h);
			}
			listView.setModel(model);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		diamoniLabel = new JLabel("Stoixeia Diamonis");
		hotelLabel = new JLabel("Hotel");
		allInclusiveLabel = new JLabel("AllInclusive");
		
		daysField = new JTextField("Hmeres Diamonis");
		mealsField = new JTextField("Plithos Geumatwn (1,2,3)");
		costField = new JTextField("Synoliko Kostos");
		
		storeButton = new JButton("Apothikeusi Kratisis");
		calculateCostButton = new JButton("Ypologismos Kostous");
		
		diamoniPanel.setLayout(new BoxLayout(diamoniPanel, BoxLayout.Y_AXIS));
		diamoniLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		diamoniPanel.add(diamoniLabel);
		hotelLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		diamoniPanel.add(hotelLabel);
		diamoniPanel.add(listView);
		diamoniPanel.add(daysField);
		diamoniPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		allInclusivePanel.setLayout(new GridLayout(2,0));
		allInclusivePanel.add(allInclusiveLabel);
		allInclusivePanel.add(mealsField);
		allInclusivePanel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		buttonPanel.setLayout(new GridLayout(2,0));
		buttonPanel.add(storeButton);
		buttonPanel.add(calculateCostButton);
		buttonPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		panel.add(diamoniPanel);
		panel.add(allInclusivePanel);
		panel.add(buttonPanel);
		panel.add(costField);

		storeButton.addActionListener(new ButtonListener());
		calculateCostButton.addActionListener(new ButtonListener());
		
		this.setContentPane(panel);
		
		this.setVisible(true);
		this.setSize(250, 320);
		this.setLocation(200, 0);
		this.setTitle("Input");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if(source == storeButton){
				Hotel selectedHotel = (Hotel) listView.getSelectedValue();
				int days = Integer.parseInt(daysField.getText());
				String mealsText = mealsField.getText().trim();

				Booking booking;
				if(mealsText.isEmpty()){
					booking = new Basic(days);
				}
				else{
					int meals = Integer.parseInt(mealsText);
					booking = new AllInclusive(days, meals);
				}
				selectedHotel.addBooking(booking);
			}
			else if (source == calculateCostButton){
				Hotel selectedHotel = (Hotel) listView.getSelectedValue();
				double total = selectedHotel.totalCost();
				costField.setText(total + "");
			}
		}
	}

}
