package apackage;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContainerFrame extends JFrame {

    private JPanel containerPanel;
    private JPanel centerPanel;

    private JTextField codeField;
    private JTextField destionationField;
    private JTextField weightField;
    private JTextField powerField;

    private JButton createBulkButton;
    private JButton createRefridgeratorButton;

    private JList shipList;

    private ArrayList<Ship> ships = new ArrayList<>();

    public ContainerFrame(ArrayList someShips){

        this.ships = someShips;
        codeField = new JTextField("Code");
        destionationField = new JTextField("Destination");
        weightField = new JTextField("Weight");
        powerField = new JTextField("Power");

        createBulkButton = new JButton("Create Bulk");
        createRefridgeratorButton  = new JButton("Create Refridgerator");
        
        shipList = new JList<>();

        containerPanel = new JPanel();
        centerPanel = new JPanel();

        GridLayout grid = new GridLayout(3,2);
        containerPanel.setLayout(grid);

        containerPanel.add(codeField);
        containerPanel.add(destionationField);
        containerPanel.add(weightField);
        containerPanel.add(powerField);
        containerPanel.add(createBulkButton);
        containerPanel.add(createRefridgeratorButton);

        BorderLayout border = new BorderLayout();
        centerPanel.setLayout(border);

        centerPanel.add(shipList, BorderLayout.NORTH);
        centerPanel.add(containerPanel, BorderLayout.CENTER);

        DefaultListModel model = new DefaultListModel<>();
        
        for(Ship s: ships){
            model.addElement(s.getName());
        }
        shipList.setModel(model);

        this.setContentPane(centerPanel);

        ButtonListener listener = new ButtonListener();
        createBulkButton.addActionListener(listener);
        createRefridgeratorButton.addActionListener(listener);

        setVisible(true);
        setSize(250,250);
        setTitle("Container Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        String code = codeField.getText();
        String destination = destionationField.getText();

        String selectedShipName = (String) shipList.getSelectedValue();
   
        Ship selectedShip = null;
        for(Ship s: ships)
            if(s.getName().equals(selectedShipName))
                selectedShip = s;
   
        if(e.getSource() == createBulkButton){
            String weightText = weightField.getText();
            double weight = Double.parseDouble(weightText);
            Bulk newContainer = new Bulk(code, destination, weight);
            selectedShip.addContainer(newContainer);

        }
        else{
            String powerText = powerField.getText();
            double power = Double.parseDouble(powerText);
            Refridgerator newContainer = new Refridgerator(code, destination, power);
            selectedShip.addContainer(newContainer);

        }
        System.out.println("Selected ship chrage: "+ selectedShip.getTotalCharge());
    }
}









}
