import java.util.Optional;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;

public class ChoosingActorState extends GameState {
    public ChoosingActorState(Stage s) {
        super(s);
    }
    @Override
    public void paint(Graphics g, Point mouseLoc) {
        super.stage.grid.paint(g, mouseLoc);
        super.stage.grid.paintOverlay(g, super.stage.cellOverlay, new Color(0f, 0f, 1f, 0.5f));
        for(Actor a: super.stage.actors) {
            a.paint(g);
        }


    }
    @Override
    public void mouseClicked(int x, int y) {
        super.stage.actorInAction = Optional.empty();
            for(Actor a: super.stage.actors) {
                if(a.loc.contains(x, y) && a.isHuman()) {
                    super.stage.actorInAction = Optional.of(a);
                    super.stage.cellOverlay = super.stage.getClearRadius(a.loc, a.moves);
                    super.stage.currentState = new ChoosingLocationState(stage);
                    break;
                }
            }
        }
    }