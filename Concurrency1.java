public class Concurrency1 {
    public static void main(String[] args){
        Thread t1 = new Thread(new HelloRunnable());
        t1.start();
        HelloThread t2 = new HelloThread();
        t2.start();
    }
}

class HelloRunnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from thread 1.");
    }
}

class HelloThread extends Thread{
    @Override
    public void run(){
        System.out.println("Hello from thread 2.");
    }
}
