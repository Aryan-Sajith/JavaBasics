package additional_tooling.gui.essentials.DragNDrop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    ImageIcon image = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/gui/essentials/DragNDrop/Happy.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner, prevPt; //Useful imageCorner for paintComponent method
    public DragPanel() {
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    // This method repaints our image after we update the its position
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        image.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());
    }

    // This inner class waits until we click the mouse(so MouseAdaptor)
    private class ClickListener extends MouseAdapter  {
        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint(); // This updates the previous point to new location
        }
    }

    // This inner class moves the image as the mouse moves
    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();
            imageCorner.translate(
                    (int)(currentPt.getX() - prevPt.getX()),
                    (int)(currentPt.getY() - prevPt.getY())
            );
            prevPt = currentPt;
            repaint();
        }
    }
}
