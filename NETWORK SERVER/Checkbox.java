
//program to create Checkbox
import javax.swing.*;

public class Checkbox {
    Checkbox() {
        JFrame f = new JFrame("CheckBox");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        JCheckBox checkBox1 = new JCheckBox("CSE");
        checkBox1.setBounds(100, 100, 100, 20);
        f.add(checkBox1);

        JCheckBox checkBox2 = new JCheckBox("ECE", true);
        checkBox2.setBounds(100, 150, 100, 20);
        f.add(checkBox2);
    }

    public static void main(String[] args) {
        new Checkbox();
    }

}