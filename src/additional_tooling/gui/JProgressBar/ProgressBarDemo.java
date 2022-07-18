package additional_tooling.gui.JProgressBar;

import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    public ProgressBarDemo() {
        // JProgressBar setup
        bar.setValue(100);
        bar.setStringPainted(true); // Shows percent for progress bar
        bar.setFont(new Font("MV Boli",Font.BOLD,12));

        // Adds components to the JFrame
        frame.add(bar);
        // JFrame setup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }
    public void fill() {
        for(int i = 100; i > 0; i--) {
            bar.setValue(i);
            try {
                Thread.sleep(50); // This helps add realtime visual growth for the bar
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        bar.setString("Done!"); // Displays message after progress bar is filled
    }
}
