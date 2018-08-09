package singleton;

/**
 * @author ThoTV on 30/07/2018 !
 */
public class ThreadSafeSingletonTest {
    public static void main(String[] args) {
        ThreadOperator threadOperator = new ThreadOperator();
        Thread thread = new Thread(threadOperator,"Thread 1");
        Thread thread2 = new Thread(threadOperator,"Thread 2");
        thread.start();
        thread2.start();
    }
}
class ThreadOperator implements Runnable{
    boolean isRun = true;
    int iCount=0;
    @Override
    public synchronized void run() {
        while (isRun){
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
            try {
                //threadSafeSingleton.showThreadDetail(Thread.currentThread().getName());
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+" "+iCount++);
                if (iCount==100){
                    isRun = false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}