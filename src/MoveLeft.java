import java.util.List;
public class MoveLeft {
    // public void move(Actor actor, Grid grid, List<Actor> actors) {
    //     List<Cell> possibleLocs = grid.getRadius(actor.loc, actor.moves);
    //     for (Actor a : actors) {
    //         possibleLocs.remove(a.loc);
    //     }
    //     if (!possibleLocs.isEmpty()) {
    //         Cell leftMost = possibleLocs.stream()
    //                                     .min((c1, c2) -> Integer.compare(c1.col, c2.col))
    //                                     .orElse(actor.loc);
    //         actor.setLocation(leftMost);
    //     }
    // }
    public Cell move(Actor actor, List<Cell> possibleLocs){
        Cell leftmost = possibleLocs.get(0);
        for(Cell c: possibleLocs){
            if(c.col < leftmost.col){
                leftmost = c;
            }
        }
        return leftmost;
    }
}