package factory;

/**
 * @author ThoTV on 02/08/2018 !
 */
public class ComputerFactory {
    public static Computer createComputer(ComputerType computerType, String CPU, String RAM, String HDD) {
        Computer computer = null;
        switch (computerType) {
            case PC:
                computer = new PC(CPU, RAM, HDD);
                break;
            case SERVER:
                computer = new Server(CPU, RAM, HDD);
                break;
        }
        return computer;
    }
}
