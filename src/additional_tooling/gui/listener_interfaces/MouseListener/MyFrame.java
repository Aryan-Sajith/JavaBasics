package additional_tooling.gui.listener_interfaces.MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener{
    JLabel label;
    ImageIcon crying,sad,neutral,happy,money;

    public MyFrame() {
        // ImageIcons Setup
        crying = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/gui/listener_interfaces/MouseListener/Crying.png");
        sad = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/gui/listener_interfaces/MouseListener/Sad.png");
        neutral = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/gui/listener_interfaces/MouseListener/Neutral.png");
        happy = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/gui/listener_interfaces/MouseListener/Happy.png");

        // JLabel setup
        label = new JLabel();
        label.setOpaque(true);
        label.addMouseListener(this);
        label.setIcon(neutral);

        // Adds components to JFrame
        this.add(label);
        // JFrame setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setLocationRelativeTo(null); // Centers window on screen
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mb has been clicked(pressed and released) on a component
        System.out.println("You clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been held down on a component
        label.setIcon(sad);
        label.setBackground(Color.blue);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        label.setIcon(crying);
        label.setBackground(new Color(0x00008b));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when a mouse enters a component
        label.setIcon(happy);
        label.setBackground(new Color(0x90EE90));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
        label.setIcon(neutral);
        label.setBackground(Color.white);
    }
}
