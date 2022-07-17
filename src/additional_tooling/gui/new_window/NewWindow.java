package additional_tooling.gui.new_window;

import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Welcome to the new frame!");
    public NewWindow() {
        label.setBounds(0,0,300,50);
        label.setFont(new Font("Times New Roman",Font.PLAIN,25));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
