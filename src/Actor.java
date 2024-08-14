import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
public abstract class Actor {
  Color color;
  Cell loc;
  Polygon shape[] ;

  public void paint(Graphics g) {
   for(Polygon shape : shape){
    g.setColor(color);
    g.fillPolygon(shape);
    g.setColor(color.BLACK);
    g.drawPolygon(shape);
   }  
  }
}
