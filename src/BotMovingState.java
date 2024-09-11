import java.awt.Graphics;
import java.awt.Point;
import java.util.List;
public class BotMovingState extends GameState {
    public BotMovingState(Stage s) {
        super(s);
    }
    public void paint(Graphics g, Point mousePos) {
        for(Actor a: super.stage.actors) {
            if(!a.isHuman()) {
              List<Cell> possibleLocs = super.stage.getClearRadius(a.loc, a.moves);
              Cell nextLoc = a.strat.chooseNextLoc(possibleLocs);
              a.setLocation(nextLoc);
            }
          }
          super.stage.currentState = new ChoosingActorState(stage);
          for(Actor a: super.stage.actors) {
            a.turns = 1;
          }
    }
    
    @Override
    public void mouseClicked(int x, int y) {
        // do nothing
    }
}
