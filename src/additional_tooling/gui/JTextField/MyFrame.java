package additional_tooling.gui.JTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    public MyFrame(){
        // Defines the JTextField
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.PLAIN,25));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("Username");


        //JButton to submit the text
        button = new JButton("Submit");
        button.addActionListener(this);

        // Adds the text-field to the JFrame
        this.add(button);
        this.add(textField);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("Hi! "+textField.getText());
            button.setEnabled(false);
            textField.setEditable(false); // Disables ability to change text
        }
    }
}
