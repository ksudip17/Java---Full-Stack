//program to create swing-button on form

import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JButton b = new JButton("Click here");
        b.setBounds(130, 100, 100, 40);

        f.add(b);

        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);

    }
}
