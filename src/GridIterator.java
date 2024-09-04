import java.util.Iterator;
public class GridIterator implements Iterator<Cell> {
  // Creat variables to store
  // 1. The data being travsed 
  Cell[][] data;
  // 2. The current state of 'this' iterator
    // int cuRow;
    // int cuCol;
    int state;
  //write the constructor
    public GridIterator(Cell[][] data) {
        // Initialize the data being traversed
        // Initialize the current state of 'this' iterator

        this.data = data;
        // this.cuRow = 0;
        // this.cuCol = 0;
        state = 0;

    }
  
  @Override
  public boolean hasNext() {
    // Implement the hasNext method
    // if(cuRow < data.length && cuCol < data[cuRow].length) {
    //     return true;
    // }
    // return false;
    if(state < data.length * data[0].length) {
        return true;
    }else {
        return false;
    }
  }
  @Override
  public Cell next() {
    // Implement the next method
    // if(cuCol < data[cuRow].length) {
    // //     cuCol++;
    // // } 
    // if(cuCol >= data[cuRow].length) {
    //     cuRow++;
    //     cuCol = 0;
    // }
    // Cell result = data[cuRow][cuCol];
    // cuCol++;
    // return result;
    Cell result = data[state/ data.length][state % data.length];
    state++;
    return result;
  }
  
}
