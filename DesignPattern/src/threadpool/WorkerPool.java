package threadpool;

import java.util.Date;
import java.util.concurrent.*;

/**
 * @author ThoTV on 13/08/2018 !
 */
public class WorkerPool {
    public static void main(String args[]) throws InterruptedException{
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);
        //ScheduledThreadPoolExecutor scheduledThreadPool = new ScheduledThreadPoolExecutor(2);
        //ScheduledThreadPool scheduledThreadPool = new ScheduledThreadPool(2);
        System.out.println("Current Time: "+new Date());
        //RejectedExecutionHandler implementation
        RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();
        //Get the ThreadFactory implementation to use
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        //creating the ThreadPoolExecutor
        ThreadPoolExecutor executorPool = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), threadFactory, rejectionHandler);
        //start the monitoring thread
//        MyMonitorThread monitor = new MyMonitorThread(scheduledThreadPool, 3);
//        Thread monitorThread = new Thread(monitor);
//        monitorThread.start();
        //submit work to the thread pool
        //for(int i=0; i<4; i++){
            WorkerThread worker = new WorkerThread("do heavy processing");
            //executorPool.execute(worker);
            scheduledThreadPool.scheduleAtFixedRate(worker, 10,5, TimeUnit.SECONDS);
//        ScheduledFuture<?> result = scheduledThreadPool.scheduleAtFixedRate(worker,5,5,TimeUnit.SECONDS);
        //}

        Thread.sleep(3000);
        //shut down the pool
        executorPool.shutdown();
        scheduledThreadPool.shutdown();
        //shut down the monitor thread
        //Thread.sleep(5000);
        //monitor.shutdown();

    }
}
