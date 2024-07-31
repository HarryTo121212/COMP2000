import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.plaf.DimensionUIResource;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }
    class Canvas extends JPanel implements MouseMotionListener{

        grid grid;
        Point p;

        public Canvas(){
            setPreferredSize( new Dimension(720, 720 ));
            addMouseMotionListener(this);
        }


        @Override
        public void paint(Graphics g){
            grid = new grid();  
            p = getMousePosition();
            grid.paint(g, p); 
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            repaint();
        }

    }
    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible( true);
    }
}