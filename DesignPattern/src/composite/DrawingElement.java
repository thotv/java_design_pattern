package composite;

/**
 * @author ThoTV on 08/08/2018 !
 */
public abstract class DrawingElement {
     protected String name;

    public DrawingElement(String name) {
        this.name = name;
    }
    public abstract void add(DrawingElement drawingElement);
    public abstract void remove(DrawingElement drawingElement);
    public abstract void display(int indent);
}
