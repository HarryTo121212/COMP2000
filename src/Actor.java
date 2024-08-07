import java.awt.Color;
import java.awt.Graphics;
public class Actor extends Cell {
    public Cell cell;
    public Color color;

    public Actor(Cell cell, Color color) {
        super(cell.x, cell.y);
        this.cell = cell;
        this.color = color;
    }
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x+35, y+35, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(x+35, y+35, size, size);
    }
    class Cat extends Actor {
        public Cat(Cell cell) {
            super(cell, Color.BLUE);
        }
    }
    class Dog extends Actor {
        public Dog(Cell cell) {
            super(cell, Color.YELLOW);
        }
    }
    class Bird extends Actor {
        public Bird(Cell cell) {
            super(cell, Color.GREEN);
        }
    }   
    
}
