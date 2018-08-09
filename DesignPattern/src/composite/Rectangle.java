package composite;

/**
 * @author ThoTV on 07/08/2018 !
 */
public class Rectangle implements Shape{
    Shape[] rectangleEdges = {new Line(-1,-1,1,-1),new Line(-1,1,1,1),new Line(-1,-1,-1,1),new Line(1,-1,1,1)};
    @Override
    public void renderShapeToScreen() {
        for(Shape s : rectangleEdges){
            // delegate to child objects
            s.renderShapeToScreen();
            System.out.println("Rectangle: "+s.toString());
        }
    }

    @Override
    public Shape[] explodeShape() {
        return rectangleEdges;
    }
}
