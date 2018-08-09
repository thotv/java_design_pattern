package composite;

/**
 * @author ThoTV on 07/08/2018 !
 */
public class Line implements Shape {
    /**
     *
     * @param point1X
     * @param point1Y
     * @param point2X
     * @param point2Y
     */
    public Line(int point1X, int point1Y, int point2X, int point2Y) {
    }
    @Override
    public void renderShapeToScreen() {
        System.out.println("This is Line");
    }

    @Override
    public Shape[] explodeShape() {
        Shape[] shapeParts = {this};
        return shapeParts;
    }
}
