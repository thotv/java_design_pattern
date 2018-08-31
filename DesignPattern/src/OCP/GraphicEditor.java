package OCP;

/**
 * @author ThoTV on 30/08/2018 !
 */
public class GraphicEditor {
    public void drawShape(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        Circle circle = new Circle();
        editor.drawShape(circle);
    }
}
