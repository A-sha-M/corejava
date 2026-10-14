class one implements Runnable
{
    public void run()
    {
        for(int i=0;i<4;i++)
        {
        System.out.println("Thread 1");
            try
            {
                Thread.sleep(3000);  //5 seconds
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class two implements Runnable
{
    public void run()
    {
            for(int i=0;i<4;i++){
                System.out.println("Thread 2");
                try
                {
                    Thread.sleep(5000);
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        }
}
public class thread_basic {
    public static void main(String[] args) {
        one obj1=new one();
        two obj2=new two();
        Thread o1=new Thread(obj1);
        Thread o2=new Thread(obj2);
        o1.start();
        o2.start();
        /*try
        {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        obj1.start();
        try
        {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        } */
    }
}
