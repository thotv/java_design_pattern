package adapter;

/**
 * @author ThoTV on 06/08/2018 !
 */
public class Converter {
    Gold gold = new Gold();
    //Default By Dollar
    public double getGoldValueByDollar(double weigh){
        gold.setWeigh(weigh);
        return gold.getWeigh()*1.5;
    }
}
