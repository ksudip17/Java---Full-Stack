//wap to create Popup menu //

import java.awt.*;
import java.awt.event.*;

class PopupMenuEx {
    PopupMenuEx() {
        final Frame f = new Frame("PopupMenu Example");
        final PopupMenu popupmenu = new PopupMenu("Edit");
        MenuItem cut = new MenuItem("Cut");
        cut.setActionCommand("Cut");
        MenuItem copy = new MenuItem("Copy");
        copy.setActionCommand("Copy");
        MenuItem paste = new MenuItem("Paste");
        paste.setActionCommand("Paste");
        MenuItem SelectAll = new MenuItem("SelectAll");
        SelectAll.setActionCommand("SelectAll");
        MenuItem Undo = new MenuItem("Undo");
        Undo.setActionCommand("Undo");
        MenuItem Redo = new MenuItem("Redo");
        Redo.setActionCommand("Redo");
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);
        popupmenu.add(SelectAll);
        popupmenu.add(Undo);
        popupmenu.add(Redo);

        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                popupmenu.show(f, e.getX(), e.getY());
            }
        });

        f.add(popupmenu);
        f.setSize(400, 400);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
    }

    public static void main(String[] args) {
        new PopupMenuEx();
    }
}