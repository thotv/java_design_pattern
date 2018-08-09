package abstractfactory;

/**
 * @author ThoTV on 02/08/2018 !
 */
public class ComputerFactory  {
    public static Computer createComputer(ComputerAbstractFactory computerAbstractFactory) {
        return computerAbstractFactory.createComputer();
    }
}
