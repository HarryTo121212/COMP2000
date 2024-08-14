import java.awt.Graphics;
import java.awt.Point;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Stage {
  ArrayList<Actor> actors;
  Grid grid;
  Actor cat;
  Actor dog;
  Actor bird;

  public Stage() {
    grid = new Grid();
    actors = new ArrayList<Actor>();
    actors.add(new Cat(grid.cellAtColRow(0, 0)));
    actors.add(new Dog(grid.cellAtColRow(0, 15)));
    actors.add(new Bird(grid.cellAtColRow(12, 9)));

  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    for (Actor actor : actors) {
      actor.paint(g);
    }
    // actors.forEach(actor -> actor.paint(g));
    // actors.stream()
    //   .map(null)
    //   .filter(null)
    //   .collect(null);
  }
}
