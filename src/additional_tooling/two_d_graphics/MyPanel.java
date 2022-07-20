package additional_tooling.two_d_graphics;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Image image;
    public MyPanel() {
        image = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/two_d_graphics/Tent.png").getImage();
        this.setPreferredSize(new Dimension(640,453));
    }

    // paint() draws stuff for us, and is inherited by components!
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g; // Updated child class Graphics2D

        // Draws a line
        /*g2d.setPaint(Color.blue); // Sets line color
        g2d.setStroke(new BasicStroke(5)); // Sets line width
        g2d.drawLine(0,0,500,500);*/

        // Draws rectangle
       /* g2d.setPaint(Color.red); // Sets rectangle color
          g2d.setStroke(new BasicStroke(5)); // Sets line width
        g2d.drawRect(0,0,100,100);
        g2d.fillRect(0,0,100,100); // Fills the rectangle with color*/

        // Draws circle
        /*g2d.setPaint(Color.orange); // Sets circle color
        g2d.setStroke(new BasicStroke(5)); // Sets line width
        g2d.drawOval(0,0,100,100);
        g2d.fillOval(0,0,100,100);*/

        // Draw arc (practice pokéball)
      /*  g2d.setPaint(Color.red);
        g2d.fillArc(0,0,100,100,0,180);
        g2d.setPaint(Color.white);
        g2d.fillArc(0,0,100,100,180,180);*/

        // Draws triangle
       /* int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        g2d.setPaint(Color.yellow);
        g2d.drawPolygon(xPoints,yPoints,3);
        g2d.fillPolygon(xPoints,yPoints,3);*/

        // Draws string of text
       /* g2d.setPaint(Color.pink);
        g2d.setFont(new Font("Ink Free",Font.BOLD,40));
        g2d.drawString("You are the best!",50,50);*/

        // Adds an image to 2d graphic
        g2d.drawImage(image,0,0,null);
    }
}
