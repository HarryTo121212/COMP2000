import java.awt.Graphics;
import java.awt.Point;
import java.util.Optional;
import java.util.ArrayList;
public class ChoosingLocationState extends GameState {


    public ChoosingLocationState(Stage s) {
        super(s);
    }
    @Override
    public void paint(Graphics g, Point mouseLoc) {
        // do we have AI moves to make?
        // do nothing
    }
    
    @Override
    public void mouseClicked(int x, int y) {
        // do nothing
        Optional<Cell> clicked = Optional.empty();
        for(Cell c: super.stage.cellOverlay) {
          if(c.contains(x, y)) {
            clicked = Optional.of(c);
          }
        }
        super.stage.cellOverlay = new ArrayList<Cell>();
        if(clicked.isPresent() && super.stage.actorInAction.isPresent()) {
          super.stage.actorInAction.get().setLocation(clicked.get());
          super.stage.actorInAction.get().turns--;
          int humansWithMovesLeft = 0;
          for(Actor a: super.stage.actors) {
            if(a.isHuman() && a.turns > 0) {
              humansWithMovesLeft++;
            }
          }
          if(humansWithMovesLeft > 0) {
            super.stage.currentState = new ChoosingActorState(stage);
          } else {
            super.stage.currentState = new BotMovingState(stage);
          }
        }
    }
}
