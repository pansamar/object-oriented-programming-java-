package apackage;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

    private JTextField studentNameField, courseNameField;
    private JButton button, button2;
    private JPanel panel;

    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();


    public MyFrame(){

        Course c1 = new Course("Java");
        Course c2 = new Course("Python");
        Course c3 = new Course("C");

        courses.add(c1);
        courses.add(c2);
        courses.add(c3);

        panel = new JPanel();

        studentNameField = new JTextField("Student's name");
        courseNameField = new JTextField("Course title");
        button = new JButton("Create student");
        button2 = new JButton("Print students");

        panel.add(studentNameField);
        panel.add(button);
        panel.add(courseNameField);
        panel.add(button2);

        this.setContentPane(panel);

        //Βήμα 3: Δημιουργία αντικειμένου ακροατή
        ButtonListener listener = new ButtonListener();
       
       //Βήμα 4: Σύνδεση ακροατή και πηγής συμβάντων
        button.addActionListener(listener);
        button2.addActionListener(listener);

        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("Event handling example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Βήμα 1: Δημιουργία κλάσης ακροατή
    class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
           if(e.getSource() == button){         
            //Βήμα 2: Συγγραφή κώδικα για δημιουργία φοιτητών
            String studentName = studentNameField.getText();
            Student newStudent = new Student(studentName);
            String courseName = courseNameField.getText();

            Course selectedCourse = null;
            for(Course c: courses){
                if(c.getName().equals(courseName)){
                    selectedCourse = c;
                }
            }
            newStudent.setCourse(selectedCourse);
            students.add(newStudent);
        }
                else
                    for(Student s: students)
                        s.printInfo();
        }
    }

}
