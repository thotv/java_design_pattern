package composite;

import org.apache.commons.lang3.StringUtils;

/**
 * @author ThoTV on 08/08/2018 !
 */
public class PrimitiveElement extends DrawingElement {
    public PrimitiveElement(String name) {
        super(name);
    }

    @Override
    public void add(DrawingElement drawingElement) {
        throw new RuntimeException("Error when try add Children to Leaf");
    }

    @Override
    public void remove(DrawingElement drawingElement){
        throw new RuntimeException("Error when try remove Children From Leaf");
    }

    @Override
    public void display(int indent) {
        System.out.println(StringUtils.repeat("-",indent)+" "+name);
    }
}
