import java.util.List;
import java.util.Random;

public class MoveRandom implements Move {
    @Override
    // public void move(Actor actor, Grid grid, List<Actor> actors) {
    //     List<Cell> possibleLocs = grid.getRadius(actor.loc, actor.moves);
    //     for (Actor a : actors) {
    //         possibleLocs.remove(a.loc);
    //     }
    //     if (!possibleLocs.isEmpty()) {
    //         int moveBotChooses = (new Random()).nextInt(possibleLocs.size());
    //         actor.setLocation(possibleLocs.get(moveBotChooses));
    //     }
    // }
    public Cell move(Actor actor, List<Cell> possibleLocs) {
        int moveBotChooses = (new Random()).nextInt(possibleLocs.size());
        return possibleLocs.get(moveBotChooses);
    }
}