import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
    
    private JPanel panel;
    private JTextField textField;
    private JButton button;

    public MyFrame(){

        panel =  new JPanel(); //Βήμα 1: Δημιουργία υποδοχέα
       
        textField = new JTextField(15); //Βήμα 2: 
        button = new JButton("Press"); //Δημιουργία γραφικών συστατικών

        panel.add(textField); //Βήμα 3:
        panel.add(button); //Προσθήκη γραφικών συστατικών στο panel

        this.setContentPane(panel); //Βήμα 4: Προσαρμογή υποδοχέα

        this.setVisible(true); 
        this.setSize(400, 400);
        this.setTitle("My first frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    






}
