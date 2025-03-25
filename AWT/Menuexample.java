import java.awt.*;
import java.awt.event.*;

public class Menuexample {
    Menuexample() {
        Frame f = new Frame("Menu and MenuItem Example");
        MenuBar mb = new MenuBar();
        Menu menu = new Menu("File");
        Menu submenu = new Menu("Actions");

        MenuItem i1 = new MenuItem("New");
        MenuItem i2 = new MenuItem("Open");
        MenuItem i3 = new MenuItem("Save");
        MenuItem i4 = new MenuItem("Copy");
        MenuItem i5 = new MenuItem("Paste");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);

        menu.add(submenu);
        mb.add(menu);

        f.setMenuBar(mb);
        f.setLayout(null);
        f.setSize(300, 300);
        f.setVisible(true);

        // Add WindowListener to handle window closing
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Exit the application
            }
        });
    }

    public static void main(String[] args) {
        new Menuexample();
    }
}