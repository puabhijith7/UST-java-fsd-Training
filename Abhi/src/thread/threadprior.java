package thread;

public class threadprior extends Thread
{
      public void run()
      {
            System.out.println("run() method");
            String threadName = Thread.currentThread().getName();
            Integer threadPrio = Thread.currentThread().getPriority();
            System.out.println(threadName + " has priority " + threadPrio);
      }
      public static void main(String[] args) throws InterruptedException
      {
            threadprior t1 = new threadprior();
            threadprior t2 = new threadprior();
            threadprior t3 = new threadprior();

            t1.setPriority(Thread.MAX_PRIORITY);
            t2.setPriority(Thread.MIN_PRIORITY);
            t3.setPriority(Thread.NORM_PRIORITY);
  
            t1.start();
            t2.start();
            t3.start();
      }
}