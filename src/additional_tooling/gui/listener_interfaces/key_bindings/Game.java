package additional_tooling.gui.listener_interfaces.key_bindings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game {
    JFrame frame;
    JLabel label;
    // We can create specific instances of our four actions
    Action upAction, downAction, leftAction, rightAction;
    public Game() {
        // Field Initializations
        frame = new JFrame("KeyBinding Demo");
        label = new JLabel();
        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        // JLabel Setup
        label.setBackground(Color.red);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);

        // These methods necessary to map keystrokes to actions!
        label.getInputMap().put(KeyStroke.getKeyStroke('w'),"upAction");
        label.getActionMap().put("upAction",upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('s'),"downAction");
        label.getActionMap().put("downAction",downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('a'),"leftAction");
        label.getActionMap().put("leftAction",leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('d'),"rightAction");
        label.getActionMap().put("rightAction",rightAction);

        // Adding components to JFrame
        frame.add(label);
        // JFrame Setup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    // You can create inner classes for specific actions
     public class UpAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY() - 10 );
        }
    }
     public class DownAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY() + 10 );
        }
    }
     public class LeftAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10,label.getY());
        }
    }
     public class RightAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10,label.getY());
        }
    }

}
