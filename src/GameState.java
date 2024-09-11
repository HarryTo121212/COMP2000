import java.awt.Graphics;
import java.awt.Point;

public abstract class GameState {

  Stage stage;
  public GameState(Stage s){
    stage = s;

  }
  public abstract  void paint(Graphics g, Point mouseLoc);
  public abstract void mouseClicked(int x, int y);
}