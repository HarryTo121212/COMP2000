import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.Graphics;
import javax.swing.plaf.DimensionUIResource;
 class Cells extends JPanel {
    int i;
    int j;
    int size;

    public Cells(int i, int j, int size) {
        this.i = i;
        this.j = j;
        this.size = size;
    }


    public void paint(Graphics g, boolean highlight) {
        g.setColor(highlight ? Color.YELLOW : Color.WHITE);
        g.fillRect(i, j, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(i, j, size, size);



    }
    
    public boolean highlighted(Point p) {
        return p.x >= i && p.x < i + size && p.y >= j && p.y < j + size && p !=null;
    }

}
