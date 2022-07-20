package additional_tooling.twoDAnimations;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    final int PANEL_WIDTH = 1280, PANEL_HEIGHT = 512;
    Image minotaur, backgroundImage;
    Timer timer;
    int xVelocity = 2, yVelocity = 2;
    int x = 0, y = 0;
    public MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        minotaur = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/twoDAnimations/Minotaur.png").getImage();
        backgroundImage = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/twoDAnimations/Maze.jpg").getImage();
        timer = new Timer(10,this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Paint background
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(backgroundImage,0,0,null);
        g2d.drawImage(minotaur,x,y,null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // Flips x-direction when it reaches a border!
        if(x >= PANEL_WIDTH - minotaur.getWidth(null) || x < 0) {
            xVelocity *= -1;
        }
        x = x + xVelocity;
        if(y >= PANEL_HEIGHT - minotaur.getHeight(null) || y < 0) {
            yVelocity *= -1;
        }
        y = y + yVelocity;
        repaint();
    }
}
