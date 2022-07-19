package additional_tooling.gui.JMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, helpMenu;
    JMenuItem loadItem, saveItem, exitItem;
    public MyFrame() {
        // MenuBar Setup
        menuBar = new JMenuBar();
        // Creates each JMenu to add to JMenuBar
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");
        // Creates JMenuItems to add to each menu
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        // Adds keyboard shortcuts for JMenus
        fileMenu.setMnemonic(KeyEvent.VK_F); // Ctrl+ Option + f for file
        editMenu.setMnemonic(KeyEvent.VK_E); // Ctrl+ Option + e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // Ctrl+ Option + h for help
        // Adds keyboard shortcuts for JMenuItems
        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for load
        exitItem.setMnemonic(KeyEvent.VK_E); // e for load

        // Adds JMenuItems to respective menus
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);


        // Adds JMenus to JMenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Sets menu bar to the JFrame
        this.setJMenuBar(menuBar);
        // JFrame Setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loadItem) {
            System.out.println("*pip* You loaded a file!");
        }
        if(e.getSource() == saveItem) {
            System.out.println("*pip* You saved a file!");
        }
        if(e.getSource() == exitItem) {
            System.exit(0);
        }
    }
}
