package composite;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author ThoTV on 08/08/2018 !
 */
public class CompositeElement extends DrawingElement {
    private List<DrawingElement> elements =
            new ArrayList<>();
    public CompositeElement(String name) {
        super(name);
    }

    @Override
    public void add(DrawingElement drawingElement) {
        elements.add(drawingElement);
    }

    @Override
    public void remove(DrawingElement drawingElement) {
        elements.remove(drawingElement);
    }

    @Override
    public void display(int indent) {
        try{
            System.out.println(StringUtils.repeat("-",indent)+"+ "+name);
            for (DrawingElement drawingElement : elements){
                drawingElement.display(indent+2);
            }
            //
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
