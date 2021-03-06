package threadpool;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author ThoTV on 13/08/2018 !
 */
public class RejectedExecutionHandlerImpl implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(r.toString() + " is rejected");
    }

}
