package abstractfactory;

/**
 * @author ThoTV on 02/08/2018 !
 */
public class PCFactory implements ComputerAbstractFactory {
    @Override
    public Computer createComputer() {
        return new PC(this.CPU, this.RAM, this.HDD);
    }

    private String RAM;
    private String HDD;
    private String CPU;

    public PCFactory(String ram, String hdd, String cpu) {
        this.RAM = ram;
        this.HDD = hdd;
        this.CPU = cpu;
    }
}
