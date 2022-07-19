package additional_tooling.gui.funStuff.JSlider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    public SliderDemo() {
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);

        // Label setup!
        label.setText(slider.getValue()+"°C"); // Returns current value from the JSlider

        // Slider setup!
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(25);
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.setPaintLabels(true); // Adds numbers to the slider
        slider.setPaintTrack(true); // Makes slider painted
        slider.setFont(new Font("Times New Roman",Font.PLAIN,15));
        slider.addChangeListener(this);

        // JPanel and JFrame setup
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // This method tracks when the state of the slider has changed
    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText(slider.getValue()+"°C");
    }
}
