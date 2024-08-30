
package iteratordemo;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author lkfritz
 */
public class Rectangles implements Aggregate<Rectangle> {
    
    private List<Rectangle> rectangles;
    
    public Rectangles(List<Rectangle> rectangles){
        this.rectangles = rectangles;
    }

    @Override
    public Iterator<Rectangle> createIterator() {
        return new RectangleIterator(rectangles);
    }
    
}
