package singleton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ThoTV on 30/07/2018 !
 */
public class BillPughSingleton implements Serializable {

    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}

class EagerInitializedSingletonTest {
//    static String strA="";
    public static void main(String[] args) {
//        strA="AA";
//        System.out.println("");
        Thread thread = new Thread(new ThreadDestroySingleton());
        Thread thread2 = new Thread(new ThreadDestroySingleton());
        Thread thread3 = new Thread(new ThreadDestroySingleton());
        Thread thread4 = new Thread(new ThreadDestroySingleton());
        thread.start();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
class ThreadDestroySingleton implements Runnable {
    @Override
    public void run() {
        while (true) {
            LazyInitializedSingleton eagerInitializedSingleton = LazyInitializedSingleton.getInstance();
            System.out.println("HashCode: " + eagerInitializedSingleton.hashCode() + "   Thread Info: " + Thread.currentThread());
        }
    }
}

class HashCodeDemo {

}
