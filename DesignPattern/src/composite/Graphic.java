package composite;

/**
 * @author ThoTV on 08/08/2018 !
 */
public class Graphic {
    public static void main(String[] args) {
        CompositeElement compositeElement = new CompositeElement("Picture");
        compositeElement.add(new PrimitiveElement("Green Box"));
        //Create Branch
        CompositeElement compositeElement1 = new CompositeElement("Two Circle");
        compositeElement1.add(new PrimitiveElement("Black Circle"));
        compositeElement1.add(new PrimitiveElement("White Circle"));
        compositeElement.add(compositeElement1);
        compositeElement.add(new PrimitiveElement("Red Box"));
        compositeElement.display(1);
    }
}
