public class Concurrency4 {
    public static void main(String[] args){
        Counter ct = new Counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ct.getCounter();
            }
        },"thread 1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ct.continueCounter();
            }
        }, "thead 2");
        t2.start();
        t1.start();
    }
}

class Counter{
    boolean done = false;
    int sum;
    public synchronized void getCounter(){
        System.out.println(Thread.currentThread().getName() +" is starting.");
        for(int i=0; i<100000; i++){
            sum++;
        }
        done = true;
        notify(); //wake up a single random thread in the same object
    }

    public synchronized void continueCounter(){
        while (!done) {
            try {
                System.out.println(Thread.currentThread().getName() +" is waiting.");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(sum+1000);
    }
}
