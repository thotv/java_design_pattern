package abstractfactory;

/**
 * @author ThoTV on 02/08/2018 !
 */
public class Laptop implements Computer{
    private String CPU;
    private String RAM;
    private String HDD;

    public Laptop(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }

    @Override
    public String getRAM() {
        return this.RAM;
    }

    @Override
    public String getHDD() {
        return this.HDD;
    }

    @Override
    public String toString() {
        return "Laptop{} "+this.getCPU();
    }
}
