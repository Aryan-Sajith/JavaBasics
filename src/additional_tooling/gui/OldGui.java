package additional_tooling.gui;

import javax.swing.JOptionPane;

public class OldGui {
    public static void main(String[] args) {
        // asks user for name, age, and height with a simple GUI
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello " + name);

        int age =   Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"You are " +age+ " years old");

        double height =   Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"You are " +height+ " cm tall");
    }
}
