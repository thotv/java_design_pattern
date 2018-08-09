package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ThoTV on 07/08/2018 !
 */
public class ComplexShape implements Shape {
    List shapeList = new ArrayList();

    public void addToShape(Shape shapeToAddToCurrentShape) {

        shapeList.add(shapeToAddToCurrentShape);

    }

    @Override
    public void renderShapeToScreen() {
        for (Object s : shapeList) {
            // use delegation to handle this method
            ((Shape) s).renderShapeToScreen();
            System.out.println("ComplexShape : " + s.toString());
        }
    }

    @Override
    public Shape[] explodeShape() {
        return (Shape[]) shapeList.toArray(new Shape[shapeList.size()]);
    }
}
