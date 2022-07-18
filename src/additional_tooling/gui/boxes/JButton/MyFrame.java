package additional_tooling.gui.boxes.JButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Implement ActionListener Interface to add user interaction functionality
public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    public MyFrame() {
        // ImageIcon to add to the Label!
        ImageIcon icon2 = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/gui/JButton/Shocked_Face.png");
        // Label to display when button is clicked!
        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false); // Sets visibility false show we show it later with ActionEvent

        // ImageIcon to add to the Button!
        ImageIcon icon = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/gui/JButton/Cursor.png");
        // JButton creation!
        button = new JButton();
        button.setBounds(200,100,200,100);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Times New Roman",Font.BOLD,25));
        button.setIconTextGap(-5);
        button.setForeground(Color.BLUE); // Text color
        button.setBackground(Color.DARK_GRAY); // Button color
        button.setBorder(BorderFactory.createBevelBorder(0)); // Button Border
        button.setEnabled(true); // Disables button
        // We add an action listener class to the button for functionality(i.e. this class!)
        button.addActionListener(this);
        button.setText("Click Here!"); // Button Text
        button.setFocusable(false); // Removes Button Border

        this.add(button);
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
    }

    // This method helps define button functionality!
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            label.setVisible(true);
        }
    }
}
