// create button by use of constuctor method on GUI

import javax.swing.*;

public class SwingCons {

    JFrame f;

    SwingCons() {
        f = new JFrame();
        JButton b = new JButton("anh anh");
        b.setBounds(130, 100, 100, 40);

        f.add(b);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        
    }

    public static void main(String[] args) {
        new SwingCons();
    }

}
