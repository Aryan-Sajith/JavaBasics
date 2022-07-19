package additional_tooling.gui.essentials.JFrame;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {
    MyJFrame() {
        // Creates an image icon
        ImageIcon image = new ImageIcon("Image Icon Pathway Here!");

        // Sets up the JFrame
        this.setTitle("JFrame title here"); // Title
        this.setSize(300,300); // Dimensions(x,y)
        this.getContentPane().setBackground(new Color(221,123,53)); // Background Color
        this.setIconImage(image.getImage()); //Top-Left Logo
        this.setResizable(false); // Resizability
        this.setVisible(true); // Visibility
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes program when JFrame closes
    }
}
