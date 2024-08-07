import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Main extends JFrame {
  public Stage stage;
  Grid grid = new Grid();
    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

    class Canvas extends JPanel {
      Grid grid = new Grid();
      public Canvas() {
        setPreferredSize(new Dimension(720, 720));
      }

      @Override
      public void paint(Graphics g) {
        super.paint(g);
        stage.paint(g, getMousePosition());
        
      }
    }

    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      Actor[] actors = {
        new Cat(grid.cells[1][1]),
        new Dog(grid.cells[2][2]),
        new Bird(grid.cells[3][3])
    };
      stage = new Stage(grid, actors);
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
    }

    public void run() {
      while(true) {
        repaint();
      }
    }
  }
