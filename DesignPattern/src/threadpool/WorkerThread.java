package threadpool;

import java.util.Date;

/**
 * @author ThoTV on 13/08/2018 !
 */
public class WorkerThread implements Runnable {
    private String command;

    public WorkerThread(String s) {
        this.command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Command = " + command+" Time: "+new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End. Time: "+new Date());
    }

    private void processCommand() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }
}
