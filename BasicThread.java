/**
 * This code is to synchronize the main thread and two other threads.
 * @author vuongchu
 *
 */
public class BasicThread {
    static long count = 0;
    public static void main(String[] args) {
        Thread t1 = new Thread(new machine());
        t1.start();
        
        Thread t2 = new Thread() {
            public void run() {
                for(long i=1; i<=20_000_000;i++) {
                    synchronized(BasicThread.class) {
                        count++;
                    }
                }
            }
        };
        t2.start();
        
        for(long i=1; i<=10_000_000;i++) {
            synchronized(BasicThread.class) {
                count++;
            }
        }
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(count);
        
    }

}

class machine implements Runnable {
    
    @Override
    public void run() {
       for(long i=1; i<=10_000_000;i++) {
           synchronized(BasicThread.class) {
               BasicThread.count++;
           }
       }
    } 
}
