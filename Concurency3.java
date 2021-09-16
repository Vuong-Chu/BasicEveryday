public class Concurency3 {


    public static void main(String[] args){

        ID id = new ID();
        Runnable r2 = () -> {
            //synchronized (id){
                id.printOut();
            //}
        };
        Runnable r3 = () -> {
            synchronized (id){
                id.showOut();
            }
        };
        Thread one = new Thread(r2,"one");
        one.start();
        Thread two = new Thread(r2,"two");
        two.start();
        Thread three = new Thread(r3,"three");
        three.start();
        Thread four = new Thread(r3,"four");
        four.start();
    }
}

class ID {
    public synchronized void printOut() {
        for(int i=1; i<=10; i++) {
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
        System.out.println("---Blast off!");
    }

    public void showOut() {
        for(int i=1; i<=10; i++) {
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
        System.out.println("---Blast off!");
    }
}