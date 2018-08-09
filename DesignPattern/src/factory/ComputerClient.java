package factory;

/**
 * @author ThoTV on 02/08/2018 !
 */
public class ComputerClient {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.createComputer(ComputerType.PC,"Core-i5 8th","8GB","500GB");
        Computer server = ComputerFactory.createComputer(ComputerType.SERVER,"Core-9 8th","128GB","2TB");
        System.out.println(pc);
        System.out.println(server);
    }
}
