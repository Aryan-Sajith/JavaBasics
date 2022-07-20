package additional_tooling.twoDGraphics;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyPanel panel;
    public MyFrame() {
        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
}
