package additional_tooling.gui.text.JOptionPane;

import javax.swing.*;

// JOptionPane = A popup standard dialog box that prompts the user for info or informs them of something
public class Main {
    public static void main(String[] args) {
        // Some ways to display a message to the user
       /* JOptionPane.showMessageDialog(null,"General Info","Title",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"You are a human!","Information!",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"What?","Question",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Your computer is infected!","WARNING",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Your laptop needs help...","Error",JOptionPane.ERROR_MESSAGE);
        */

        // Asks questions where user can respond with yes/no/cancel additional_tooling.gui.buttons that are returned as ints!
        // System.out.println(JOptionPane.showConfirmDialog(null,"Aryan, are you a man?","Question",JOptionPane.YES_NO_CANCEL_OPTION));

        // Asks questions where user can respond with a string!
        // String name = JOptionPane.showInputDialog("What is your name?");

        // This combines all previous options into one method!
        String[] responses = {"Unfortunately not ;(", "You're the best!","Thanks a ton!"};
        ImageIcon imageIcon = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/gui/JOptionPane/Smiley.jpeg");
        JOptionPane.showOptionDialog(null,"You're the best!",
                "Secret Message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,
                imageIcon,responses,1);
    }
}
