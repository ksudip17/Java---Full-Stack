import javax.swing.*;

public class RadioButton {

    RadioButton() {
        JFrame f = new JFrame("RadioButton");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        ButtonGroup bg = new ButtonGroup();

        JRadioButton rb1 = new JRadioButton("RCB");
        rb1.setBounds(100, 100, 100, 20);
        bg.add(rb1);
        f.add(rb1);

        JRadioButton rb2 = new JRadioButton("MI", true);
        rb2.setBounds(100, 150, 100, 20);
        bg.add(rb2);
        f.add(rb2);
    }

    public static void main(String[] args) {
        new RadioButton();
    }
}
