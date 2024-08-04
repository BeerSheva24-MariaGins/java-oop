package telran.shapes;

import java.util.Arrays;

public class Canvas implements Shape {
    Shape[] shapes; 

    public Canvas() {
        shapes = new Shape[0];
    }

    void addShape(Shape shape) {
        shapes = Arrays.copyOf(shapes, shapes.length + 1);
        shapes[shapes.length - 1] = shape;
    }

    @Override
    public int perimiter() {
        int totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.perimiter();
        }
        return totalPerimeter;
    }

    @Override
    public int square() {
        int totalSquare = 0;
        for (Shape shape : shapes) {
            totalSquare += shape.square();
        }
        return totalSquare;
    }
}
