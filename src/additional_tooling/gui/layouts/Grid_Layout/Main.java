package additional_tooling.gui.layouts.Grid_Layout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setLayout(new GridLayout(3,3,10,10)); // Defines Grid Layout
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        // Adds JButtons!
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.setVisible(true);
    }

    // GridLayout = A layout where components are placed in a grid format with equal-sized cells and
    // components take up all the space in each cell
}
