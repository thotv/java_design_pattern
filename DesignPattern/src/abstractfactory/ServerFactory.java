package abstractfactory;

/**
 * @author ThoTV on 02/08/2018 !
 */
public class ServerFactory implements ComputerAbstractFactory {
    @Override
    public Computer createComputer() {
        return new Server(this.CPU, this.RAM, this.HDD);
    }

    private String RAM;
    private String HDD;
    private String CPU;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.RAM = ram;
        this.HDD = hdd;
        this.CPU = cpu;
    }
}
