import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.Random; 


public class Main extends JFrame {
    public void run(){
        while(true){
            this.repaint();
        }
    }
    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }
    class Canvas extends JPanel {
        LinkedList <Point> mouseTrail = new LinkedList<>();
        final int Max_Trail = 100;
        Point lastMousePoint = null;
        
        public Canvas(){
            setPreferredSize( new Dimension(720, 720 ));
        }


        @Override
        public void paint(Graphics g){

            grid grid = new grid();  
            Point currentPoint = getMousePosition();
            grid.paint(g, currentPoint);
            if(currentPoint != null){
                    mouseTrail.add(currentPoint);
                    lastMousePoint = currentPoint;
                    if(mouseTrail.size() > Max_Trail){
                        mouseTrail.removeFirst();
                    }
                
            }

            g.setColor(new Color(50, 255, 125, 50));
            for(Point point : mouseTrail){
                g.fillOval(point.x - 5, point.y - 5, 10, 10);
            }
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