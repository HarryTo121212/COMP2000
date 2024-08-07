import java.awt.Graphics;
import java.awt.Point;
public class Stage {
    public Grid grid;
    public Actor[] actor;
public Stage(Grid grid, Actor[] actor) {
    this.grid = grid;
    this.actor = actor;
    }
    public void paint(Graphics g, Point mousePos) {
        grid.paint(g, mousePos);
        for (int i = 0; i < actor.length; i++) {
            actor[i].paint(g);
        }
    }
    
}