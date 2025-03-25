
//wap to label the button on frame using AWT //
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Button_Example {
    public static void main(String[] args) {
        Frame frame = new Frame("Example Button");
        Button button = new Button("Click Me!");
        button.setBounds(80, 100, 64, 30);
        frame.add(button);
        frame.setSize(300, 300);

        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
