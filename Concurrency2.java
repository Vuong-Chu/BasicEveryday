public class Concurrency2 {
    static int sum = 0;
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                count(5000);
            }
        };
        Thread t1 = new Thread(runnable,"T1");
        Thread t2 = new Thread(runnable, "T2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sum);
    }
    public synchronized static void count(int n){
        for(int i=0; i<n; i++){
            sum++;
        }
    }
}
