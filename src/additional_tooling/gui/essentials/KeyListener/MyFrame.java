package additional_tooling.gui.essentials.KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    JLabel lionLabel, backgroundLabel;
    ImageIcon lionImage, backgroundImage;

    public MyFrame() {
        // ImageIcons setup
        lionImage = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/gui/essentials/KeyListener/Lion.png");
        backgroundImage = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/gui/essentials/KeyListener/Forest.png");

        // JLabels setup
        lionLabel = new JLabel();
        lionLabel.setBounds(0,0,96,96);
        lionLabel.setOpaque(false);
        lionLabel.setIcon(lionImage);
        backgroundLabel = new JLabel("",backgroundImage,JLabel.CENTER);
        backgroundLabel.setBounds(0,0,500,500);
        backgroundLabel.add(lionLabel);

        // Adds components to the JFrame
        this.add(backgroundLabel);
        // JFrame setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this); // Adds KeyListener to this class!
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // keyTyped() = Invoked when a key is typed. Uses KeyChar, char output
        // Useful for most keys since keys usually involve KeyChars like a, b, c, etc.
        switch (e.getKeyChar()) {
            case 'a' -> lionLabel.setLocation(lionLabel.getX() - 10, lionLabel.getY());
            case 'w' -> lionLabel.setLocation(lionLabel.getX(), lionLabel.getY() - 10);
            case 's' -> lionLabel.setLocation(lionLabel.getX(), lionLabel.getY() + 10);
            case 'd' -> lionLabel.setLocation(lionLabel.getX() + 10, lionLabel.getY());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // keyPressed() = Invoked when a physical key is pressed down. Uses KeyCode, int output
        // Useful for keys like the arrow keys which don't create KeyTyped Chars
        switch (e.getKeyCode()) {
            case 37 -> lionLabel.setLocation(lionLabel.getX() - 10, lionLabel.getY());
            case 38 -> lionLabel.setLocation(lionLabel.getX(), lionLabel.getY() - 10);
            case 39 -> lionLabel.setLocation(lionLabel.getX() + 10, lionLabel.getY());
            case 40 -> lionLabel.setLocation(lionLabel.getX(), lionLabel.getY() + 10);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // keyReleased() = Called whenever a button is released
        System.out.println("You released key char: "+e.getKeyChar()); // Prints actual character
        System.out.println("You released key char: "+e.getKeyCode()); // Prints key value(unique)
    }
}
