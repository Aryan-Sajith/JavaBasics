package additional_tooling.gui.essentials.DragNDrop;

import javax.swing.*;

public class MyFrame extends JFrame {
    DragPanel dragPanel = new DragPanel();
    public MyFrame() {
        this.add(dragPanel);
        this.setTitle("Drag & Drop demo");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
