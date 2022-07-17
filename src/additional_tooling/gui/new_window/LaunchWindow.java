package additional_tooling.gui.new_window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchWindow implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");

    public LaunchWindow() {
        button.setBounds(100,150,100,50);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(button);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            frame.dispose(); // Makes sure only one frame is running!
            NewWindow newWindow = new NewWindow(); // This part launches the new window!
        }
    }
}
