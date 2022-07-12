package additional_tooling.gui.JLabel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // JLabel = A GUI display for a string of text, an image, or both... A COMPONENT
        ImageIcon image = new ImageIcon();

        JLabel label = new JLabel();
        label.setText("Aryan Sajith the coder!"); // Sets JLabel text

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);
    }
}
