package labthree;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingComponent2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("FORM");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel name = new JLabel();
        name.setText("FullName: ");
        name.setBounds(20,20,200,200);
        frame.add(name);
     
        JTextField Name = new JTextField();
        Name.setBounds(50,20,55,100);
        frame.add(Name);
        frame.setVisible(true);

    }

}
