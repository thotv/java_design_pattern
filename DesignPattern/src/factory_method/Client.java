package factory_method;

/**
 * @author ThoTV on 31/08/2018 !
 */
public class Client {
    public static void main(String[] args) {
        Product_Creator productCreator = new Server_Creator();
        Product_Creator productCreator1 = new PC_Creator();
        Product_Creator productCreator2 = new Desktop_Creator();
        Product product = productCreator.createProduct();
        Product product1 = productCreator1.createProduct();
        Product product2 = productCreator2.createProduct();
        product.showDetail();
        product1.showDetail();
        product2.showDetail();
    }
}
