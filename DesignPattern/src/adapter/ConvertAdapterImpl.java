package adapter;

/**
 * @author ThoTV on 06/08/2018 !
 */
public class ConvertAdapterImpl extends Converter implements ConvertAdapter {
    @Override
    public double getGoldValueByDollar(double weigh) {
        return super.getGoldValueByDollar(weigh);
    }

    @Override
    public double getGoldValueByVND(double weigh) {
        Gold gold = new Gold();
        gold.setWeigh(weigh);
        return gold.getWeigh()*3.14*23500;
    }
}
