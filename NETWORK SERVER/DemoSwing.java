
import javax.swing.*;

public class DemoSwing extends JFrame {
    JFrame f;

    DemoSwing() {
        JButton b = new JButton("thich thich");
        b.setBounds(130, 100, 100, 40);
        add(b);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DemoSwing();
    }
}
