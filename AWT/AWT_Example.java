
//wap to label the helloworld in gui  form by using AWT //
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT_Example {
    public static void main(String[] args) {
        Frame frame = new Frame("Basic Program");
        Label label = new Label("Namaskar");

        label.setAlignment(Label.CENTER);
        frame.add(label);
        frame.setSize(300, 300);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}