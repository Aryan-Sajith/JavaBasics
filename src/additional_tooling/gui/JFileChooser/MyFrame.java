package additional_tooling.gui.JFileChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    public MyFrame() {
        // JButton Setup
        button = new JButton();
        button.addActionListener(this);


        // Adds components to the JFrame
        this.add(button);
        // JFrame Setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            // Setup for JFileChooser
            JFileChooser fileChooser = new JFileChooser();

            // Sets default file directory!
            fileChooser.setCurrentDirectory(new File("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/gui/JFileChooser"));

            int response = fileChooser.showOpenDialog(null); // Selects file to open
            fileChooser.showSaveDialog(null); // Selects file to save

            // If somebody successfully selects a file...
            if(response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath()); // Gets file path
                System.out.println(file);
            }
        }
    }
}
