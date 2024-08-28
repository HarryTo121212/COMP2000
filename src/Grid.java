import java.awt.Graphics;
import java.awt.Point;
import java.util.Optional;
import java.util.function.Consumer;

public class Grid {
  Cell[][] cells = new Cell[20][20];
  
  public Grid() {
    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        cells[i][j] = new Cell(colToLabel(i), j, 10+Cell.size*i, 10+Cell.size*j);
      }
    }
  }


  private char colToLabel(int col) {
    return (char) (col + Character.valueOf('A'));
  }
  private static final int MARGIN = 10;

  private int labelToCol(char col) {
    return (int) (col - Character.valueOf('A'));
  }

  public void paint(Graphics g, Point mousePos) {
    doToEachCell(c -> c.paint(g, mousePos));
  }


  public Optional<Cell> cellAtColRow(int c, int r) {
    if(c < 0 || c >= cells.length || r < 0 || r >= cells[0].length) {
      return Optional.empty();
    }
      return Optional.ofNullable(cells[c][r]);
  }

  public Optional<Cell> cellAtColRow(char c, int r) {
    return cellAtColRow(labelToCol(c), r);
  }
  public Optional<Cell> cellAtPoint(Point p) {
    if(p == null){
      return Optional.empty();
    }
    int col= (p.x-MARGIN)/Cell.size;
    int row= (p.y- MARGIN)/Cell.size;
    return cellAtColRow(col, row);
  }
  /**
     * Takes a cell consumer (i.e. a function that has a single `Cell` argument and
     * returns `void`) and applies that consumer to each cell in the grid.
     * @param func The `Cell` to `void` function to apply at each spot.
     */
    public void doToEachCell(Consumer<Cell> func) {
      // Your job to add the body
      for(int i=0; i<cells.length; i++) {
        for(int j=0; j<cells[i].length; j++) {
          func.accept(cells[i][j]);
        }
      }
    }
}
