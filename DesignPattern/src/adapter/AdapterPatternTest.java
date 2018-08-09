package adapter;

/**
 * @author ThoTV on 06/08/2018 !
 */
public class AdapterPatternTest {
    public static void main(String[] args) {
        AdapterPatternTest adapterPatternTest = new AdapterPatternTest();
        try {
            System.out.println("Dollar Value: "+adapterPatternTest.convertValue(ConvertType.DOLLAR,5));
            System.out.println("VND Value: "+adapterPatternTest.convertValue(ConvertType.VND,5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public double convertValue(ConvertType convertType,double weigh) throws Exception{
        double dReturn=0;
        ConvertAdapter convertAdapter = new ConvertAdapterImpl();
        try{
            switch (convertType){
                case VND:
                    dReturn = convertAdapter.getGoldValueByVND(weigh);
                    break;
                case DOLLAR:
                    dReturn = convertAdapter.getGoldValueByDollar(weigh);
                    break;
            }
        }catch (Exception ex){
            ex.printStackTrace();
            throw ex;
        }
        return dReturn;
    }

}
