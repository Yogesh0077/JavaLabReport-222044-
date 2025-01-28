package labthree;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SwingComponent {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Form");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblName = new JLabel();
        lblName.setText("UserName:");
        lblName.setBounds(50, 50, 150, 50);
        frame.add(lblName);

        JTextField Nametxt = new JTextField();
        Nametxt.setBounds(115, 60, 200, 30);
        frame.add(Nametxt);

        JLabel lblPassword = new JLabel();
        lblPassword.setText("Password:");
        lblPassword.setBounds(50, 80, 150, 50);
        frame.add(lblPassword);

        JPasswordField Passwordtxt = new JPasswordField();
        Passwordtxt.setBounds(115, 90, 200, 30);
        frame.add(Passwordtxt);

        JLabel lblGender = new JLabel();
        lblGender.setText("Gender:");
        lblGender.setBounds(65, 120, 150, 50);
        frame.add(lblGender);

        JRadioButton lblmale = new JRadioButton();
        lblmale.setText("Male");
        lblmale.setBounds(115, 120, 60, 50);
        frame.add(lblmale);

        JRadioButton lblfemale = new JRadioButton();
        lblfemale.setText("Female");
        lblfemale.setBounds(190, 120, 80, 50);
        frame.add(lblfemale);

        ButtonGroup gendeGroup = new ButtonGroup();
        gendeGroup.add(lblmale);
        gendeGroup.add(lblfemale);

        JLabel lblCourse = new JLabel();
        lblCourse.setText("course");
        lblCourse.setBounds(65, 160, 150, 50);
        frame.add(lblCourse);

        String courses[] = { "BCA", "BE", "Bsc.IT", "BBA" };
        JComboBox<String> boxcourse = new JComboBox<>(courses);
        boxcourse.setBounds(115, 170, 100, 30);
        frame.add(boxcourse);

        JButton submit = new JButton();
        submit.setText("Submit");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked");
            }
        });
        submit.setBounds(115, 230, 100, 30);
        frame.add(submit);

        frame.setVisible(true);
    }
}
