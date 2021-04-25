public class DynamicPrograming {

    public static void main(String[] args) {
        System.out.println(fibonaci(30));
    }
    static int[] memo = new int[100];
    public static int fibonaci(int n){
        if(n<=2){
            return 1;
        }else {
             int f = fibonaci(n-1)+fibonaci(n-2);
             memo[n-1] = f;
            return memo[n-1];
        }
    }

}
