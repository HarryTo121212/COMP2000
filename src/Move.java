
import java.util.List;

public interface Move {
    public Cell move(Actor actor,  List<Cell> possibleLocs);
}