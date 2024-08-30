
package iteratordemo;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author lkfritz
 */
//implement an iterator for a list of Rectangles
public class RectangleIterator implements Iterator<Rectangle> {
    
    private int currIndex = 0;
    private List<Rectangle> rectangles;
    
    //constructor
    public RectangleIterator(List<Rectangle> rectangles){
        this.rectangles = rectangles;
    }

    @Override
    public boolean hasNext() {
        return currIndex < rectangles.size();
    }

    @Override
    public Rectangle next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return rectangles.get(currIndex++);
        
    }
    
}
