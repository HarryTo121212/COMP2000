import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.Graphics;
import javax.swing.plaf.DimensionUIResource;



public class grid extends JPanel {
    public void paint(Graphics g, Point p) {
        Cells cell;
        for(int i=10;i<710; i+=35){
            for(int j=10;j<710; j+=35){
                cell = new Cells(i, j, 35);
                cell.paint(g, cell.highlighted(p));
            }
        }
    }
}
