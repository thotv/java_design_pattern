package factory_method;

/**
 * @author ThoTV on 31/08/2018 !
 */
public class PC_Creator implements Product_Creator {
    @Override
    public Product createProduct() {
        return new PC();
    }
}
