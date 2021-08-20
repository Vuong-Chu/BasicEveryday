import java.util.Arrays;

public class BinaryString {

    public static void main(String[] args){
       binary(5);
    }

    static int[] Array = new int[5];

    public static void binary(int n){
        if(n<=0){
            System.out.println(Arrays.toString(Array));
        }else{
            Array[n-1] = 0;
            binary(n-1);
            Array[n-1]=1;
            binary(n-1);
        }
    }

}
