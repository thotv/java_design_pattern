package singleton;

/**
 * @author ThoTV on 31/07/2018 !
 */
public class ASingleton {
    private static volatile ASingleton instance;
    private static Object mutex = new Object();

    private ASingleton() {
    }

    public static ASingleton getInstance() {
        ASingleton result = instance;
        if (result == null) {
            synchronized (mutex) {
                result = instance;
                if (result == null)
                    instance = result = new ASingleton();
            }
        }
        return result;
    }
}
class ASingleTonDemo{
    public static void main(String[] args) {
        ASingleton aSingleton = ASingleton.getInstance();
        ASingleton aSingleton2 = ASingleton.getInstance();
        System.out.println(aSingleton.hashCode());
        System.out.println(aSingleton2.hashCode());
    }
}