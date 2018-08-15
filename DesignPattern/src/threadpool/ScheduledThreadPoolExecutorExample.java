package threadpool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author ThoTV on 15/08/2018 !
 */
public class ScheduledThreadPoolExecutorExample {
    public static void main(String[] args)
    {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        Task task1 = new Task ("Demo Task 1");

        System.out.println("The time is : " + new Date());

        ScheduledFuture<?> result = executor.scheduleAtFixedRate(task1, 2, 5, TimeUnit.SECONDS);

        try {
            TimeUnit.MILLISECONDS.sleep(30000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
