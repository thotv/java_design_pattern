package factory_method;

/**
 * @author ThoTV on 31/08/2018 !
 */
public class Server implements Product {
    @Override
    public void showDetail() {
        System.out.println("This is Server Product");
    }
}
