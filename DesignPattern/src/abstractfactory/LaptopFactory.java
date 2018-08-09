package abstractfactory;

/**
 * @author ThoTV on 02/08/2018 !
 */
public class LaptopFactory implements ComputerAbstractFactory {
    private String RAM;
    private String HDD;
    private String CPU;

    public LaptopFactory(String ram, String hdd, String cpu) {
        this.RAM = ram;
        this.HDD = hdd;
        this.CPU = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Laptop(this.CPU, this.RAM, this.HDD);
    }
}
