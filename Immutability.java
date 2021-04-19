//Can't change the data type value once created.
public class Immutability {

    public static void main(String[] args) {
        Vector vector = new Vector(new double[]{20.1, 20.2});
        System.out.println(vector.toString());
    }

}

final class Vector{
    private final int N;
    private final double[] data;

    public Vector(double[] data){
        this.N = data.length;
        this.data = new double[N];
        for(int i=0; i<N; i++){
            this.data[i] = data[i];
        }
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("[");
        for (double d:data){
            string.append(d+"");
            string.append(", ");
        }
        string.append("]");
        return string.toString();
    }
}

// Mutable value affects priority queue
//    public static void main(String[] args) throws Exception {
//        PriorityQueue<Integer> ok = new PriorityQueue<>(Arrays.asList(1, 2, 3));
//        Integer i = null;
//        while ((i = ok.poll()) != null) System.out.println(i); //1,2,3
//
//        PriorityQueue<AtomicInteger> notOk = new PriorityQueue<>(Comparator.comparing(AtomicInteger::intValue));
//        AtomicInteger one = new AtomicInteger(1);
//        notOk.add(one);
//        notOk.add(new AtomicInteger(2));
//        notOk.add(new AtomicInteger(3));
//        one.set(7);
//        AtomicInteger ai = null;
//        while ((ai = notOk.poll()) != null) System.out.println(ai); //7,2,3
//    }



