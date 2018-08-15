package threadpool;

import java.util.Date;

/**
 * @author ThoTV on 15/08/2018 !
 */
public class Task implements Runnable
{
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run()
    {
        try {
            System.out.println("Doing a task during : " + name + " - Time - " + new Date());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}