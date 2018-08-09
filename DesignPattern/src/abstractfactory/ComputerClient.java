package abstractfactory;

import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @author ThoTV on 02/08/2018 !
 */
public class ComputerClient {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.createComputer(new PCFactory("8GB","500GB","Core-i5 8th"));
        Computer server = ComputerFactory.createComputer(new ServerFactory("128GB","2TB","Core-9 8th"));
        Computer laptop = ComputerFactory.createComputer(new LaptopFactory("8GB","500GB","Core-7 8th"));
        System.out.println(pc);
        System.out.println(server);
        System.out.println(laptop);
        DocumentBuilderFactory.newInstance();
    }
}
