package additional_tooling.gui.button_grouping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizzaButton, hamburgerButton, hotdogButton;

    public MyFrame() {
        // Defines a few JRadioButtons
        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");

        // Defines a grouping so only one can be clicked!
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        // Adds actionListener so it responds to being clicked
        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        //Adds JRadioButtons to the JFrame
        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        // Defines JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizzaButton) {
            System.out.println("You ordered pizza!");
        }
        else if(e.getSource() == hamburgerButton) {
            System.out.println("You ordered a hamburger!");
        }
        else if(e.getSource() == hotdogButton) {
            System.out.println("You ordered a hotdog!");
        }
    }
}
