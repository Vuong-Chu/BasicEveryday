import java.util.Arrays;

public class K_String {

    public static void main(String[] args){
       k_string(5, 5);
    }

    static int[] Array = new int[5];

    public static void k_string(int n, int k){
        if(n<=0){
            System.out.println(Arrays.toString(Array));
        }else{
            for(int i=0; i<k; i++){
                Array[n-1] = i;
                k_string(n-1, k);
            }
        }
    }

}
