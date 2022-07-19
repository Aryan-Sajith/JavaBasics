package additional_tooling.gui.boxesNbuttons.JCombobox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox comboBox;
    public MyFrame() {
        // Defines the JComboBox(we need to pass in array of reference data types)
        String[] wild_cats = {"Tiger","Lion","Leopard","Cheetah"};
        comboBox = new JComboBox(wild_cats);
        comboBox.addActionListener(this);


        // Helpful methods for ComboBox
        comboBox.setEditable(true); // Allows users to type into the box
        comboBox.getItemCount(); // Counts number of items in ComboBox
        comboBox.addItem("Panther"); // Add item to the list

        comboBox.insertItemAt("Cougar",0); // Adds item at specified index
        comboBox.setSelectedIndex(0); // Makes sure we start with the true 0-th index

        comboBox.removeItem("Cougar"); // Removes an item
        comboBox.removeItemAt(0); // Removes an item based on index
        comboBox.removeAllItems(); // Removes all items from the comboBox

        // Adds components to the JFrame
        this.add(comboBox);
        // Defines the JFrame
        this.setTitle("Wild");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox) {
            //System.out.println(comboBox.getSelectedItem()); Returns current selected item
            //System.out.println(comboBox.getSelectedIndex()); Returns the current item index
        }
    }
}
