package singleton;

/**
 * @author ThoTV on 30/07/2018 !
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public void showThreadDetail(String strThreadName) throws Exception {
        System.out.println("Detailed Thread: "+strThreadName);
    }
}
