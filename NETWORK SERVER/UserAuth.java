import javax.swing.*;
import java.awt.event.*;

public class UserAuth {
    public static void main(String[] args) {
        JFrame f = new JFrame("User Authentication");
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);

        JLabel l1 = new JLabel("Username");
        l1.setBounds(20, 20, 80, 30);
        f.add(l1);

        JTextField text = new JTextField();
        text.setBounds(100, 20, 100, 30);
        f.add(text);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(20, 75, 80, 30);
        f.add(l2);

        JPasswordField value = new JPasswordField();
        value.setBounds(100, 75, 100, 30);
        f.add(value);

        JButton b = new JButton("Login");
        b.setBounds(100, 120, 80, 30);
        f.add(b);

        JLabel label = new JLabel();
        label.setBounds(20, 150, 200, 50);
        f.add(label);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Username: " + text.getText();
                data += ", Password: " + new String(value.getPassword());
                label.setText(data);
            }
        });
    }
}