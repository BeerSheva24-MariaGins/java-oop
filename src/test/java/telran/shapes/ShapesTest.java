package telran.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShapesTest {

    @Test
    void RectangleTest() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(18, rectangle.perimiter());
        assertEquals(20, rectangle.square());
    }

    @Test
    void SquareTest() {
        Square square = new Square(4);
        assertEquals(16, square.perimiter());
        assertEquals(16, square.square());
    }

    @Test
    void CanvasTest() {
        Canvas canvas = new Canvas();
        Rectangle rectangle = new Rectangle(4, 5);
        Square square = new Square(4);

        canvas.addShape(rectangle);
        canvas.addShape(square);

        assertEquals(34, canvas.perimiter());
        assertEquals(36, canvas.square());
    }
    @Test
    void countTest() {
        Canvas mainCanvas = new Canvas();
        Rectangle rectangle = new Rectangle(4, 5);
        Square square = new Square(4);        
        mainCanvas.addShape(rectangle);
        mainCanvas.addShape(square);  

        assertEquals(2, mainCanvas.count());

        Canvas nestedCanvas = new Canvas();
        nestedCanvas.addShape(new Rectangle(2, 3));
        nestedCanvas.addShape(new Square(2));        
        mainCanvas.addShape(nestedCanvas);
        
        assertEquals(5, mainCanvas.count());
    }
}
