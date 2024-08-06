import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.Graphics;
import javax.swing.plaf.DimensionUIResource;



public class grid extends JPanel {
    Cells[][] cell = new Cells[20][20];

    public grid(){
        for(int i = 0; i < cell.length; i++){
            for(int j = 0; j < cell[i].length; j++){
                cell[i][j] = new Cells(i*Cells.size + 10, j*Cells.size + 10);
            }
        }
    }

    public void paint(Graphics g, Point p){
        for(int i = 0; i < cell.length; i++){
            for(int j = 0; j < cell[i].length; j++){
                cell[i][j].paint(g, cell[i][j].highlighted(p));
            }
        }
    }
}
