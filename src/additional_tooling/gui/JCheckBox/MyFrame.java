package additional_tooling.gui.JCheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    ImageIcon checkIcon, xIcon;
    public MyFrame(){
        // Defines an ImageIcon for the checkbox
        checkIcon = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/gui/JCheckBox/Check.png");
        xIcon = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/gui/JCheckBox/Cross.png");

        // Defines a JButton
        button = new JButton("Submit");
        button.addActionListener(this);

        // Defines the JCheckBox
        checkBox = new JCheckBox();
        checkBox.setText("I'm a human!");
        checkBox.setFocusable(false); // Removes surrounding box!
        checkBox.setFont(new Font("Times New Roman",Font.PLAIN,25));
        checkBox.setIcon(xIcon); // Default checkbox image
        checkBox.setSelectedIcon(checkIcon); // Checkbox image when used!

        // Adds components to the JFrame
        this.add(checkBox);
        this.add(button);
        // Defines the JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }
    }
}
