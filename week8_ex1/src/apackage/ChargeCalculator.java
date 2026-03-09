package apackage;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChargeCalculator extends JFrame{
   
   private JButton calculateChargeButton;
   private JPanel panel;
   private Ship ship;
   
    public ChargeCalculator(Ship aShip){

        this.ship = aShip;

        panel = new JPanel();
        calculateChargeButton = new JButton("Calculate Charge");

        panel.add(calculateChargeButton);

        this.setContentPane(panel);
 
        ButtonListener listener = new ButtonListener();
        calculateChargeButton.addActionListener(listener);

        setVisible(true);
        setSize(250,250);
        setTitle("Charge Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
              System.out.println("Total charge = " + ship.getTotalCharge());
        }
    }





}
