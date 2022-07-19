package additional_tooling.gui.JColorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    public MyFrame() {
        // JButton Setup
        button = new JButton("Pick a color");
        button.addActionListener(this);
        // JLabel Setup
        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("This is some text :)");
        label.setFont(new Font("Times New Roman",Font.PLAIN,100));
        label.setOpaque(true);


        // Adds components to the JFrame
        this.add(button);
        this.add(label);
        // JFrame Setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            // JColorChooser Setup
            Color color = JColorChooser.showDialog(null,"Choose one...",Color.black);
            label.setForeground(color);
        }
    }
}
