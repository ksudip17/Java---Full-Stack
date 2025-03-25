import javax.swing.*;

public class ScrollbarEg {
    ScrollbarEg() {
        JFrame f = new JFrame("Scrollbar Example");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        JScrollBar sb = new JScrollBar();
        sb.setBounds(100, 100, 20, 100);
        f.add(sb);
    }

    public static void main(String[] args) {
        new ScrollbarEg();
    }
}