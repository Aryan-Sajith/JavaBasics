package additional_tooling.gui.JFrame;

import javax.swing.*;
import java.awt.*;

public class JFrameGUI {
    public static void main(String[] args) {
        // JFrame = A GUI window that you can add components to(Template)
        JFrame frame = new JFrame();

        // Creates an image icon
        ImageIcon image = new ImageIcon("Image Icon Pathway Here!");

        // Sets up the JFrame
        frame.setTitle("JFrame title here"); // Title
        frame.setSize(300,300); // Dimensions(x,y)
        frame.getContentPane().setBackground(new Color(221,123,53)); // Background Color
        frame.setIconImage(image.getImage()); //Top-Left Logo
        frame.setResizable(false); // Resizability
        frame.setVisible(true); // Visibility
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes program when JFrame closes


        new MyJFrame(); //Creates a frame from a separate class!

    }
}
