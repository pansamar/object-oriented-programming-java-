import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {

    //Δήλωση γραφικών συστατικών
    private JTextField inputField;
    private JButton autonomyButton, storeButton;
    private JPanel panel;


    public GUI(ArrayList<Fleet> taxiFleet){ //Μη ξεχνάς τη δημιουργία αντικείμένου στη main

        //Αρχικοποίησή τους
        inputField = new JTextField("Give city name");
        autonomyButton = new JButton("Εμφάνιση αυτονομίας");
        storeButton = new JButton("Αποθήκευση σε αρχείο");

        panel = new JPanel();

        //Προσθήκη τους στο πάνελ
        panel.add(inputField);
        panel.add(autonomyButton);
        panel.add(storeButton);

        this.setContentPane(panel);

        //Υλοποίηση κουμπιών
        autonomyButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String name = inputField.getText();
                for(Fleet f: taxiFleet){
                    if(name.equals(f.getCityname())){
                        System.out.println("Πόλη: "+f.getCityname());
                        System.out.println("Πλήθος ταξί: " +f.getCount());
                        System.out.println("Συνολική αυτονομία: " +f.getAutonomy());
                    }
                }
            }
        });
        autonomyButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String name = inputField.getText();
                try{
                    PrintWriter outputStream = new PrintWriter("taxi.txt");
                    for(Fleet f: taxiFleet){
                        if(name.equals(f.getCityname())){
                            outputStream.println(f.getCityname());
                            double total = 0;
                            for(Taxi t: f.geTaxis()){
                                outputStream.println(t.getDriver() + " " + t.getNumber() + " " + t.getAutonomy());
                                total += t.getAutonomy();
                            }            
                            outputStream.println("Συνολική αυτονομία: "+ total);
                        }
                    }
                }
                catch(FileNotFoundException exc){
                    System.out.println("No such file");
                    System.exit(0);
                }
            }
        });

        this.setVisible(true);
        this.setTitle("Practise");
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
