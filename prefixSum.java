import java.util.Arrays;
import java.util.Scanner;

public class prefixSum {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70};
        System.out.println(Arrays.toString(recursiveSum(arr)));
        System.out.println(Arrays.toString(movingWindowsSum(arr,2))); //Windows of 2
    }

    static int[] recursiveSum(int[] arr){
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    static int[] movingWindowsSum(int[] arr, int k){
        int[] res = new int[arr.length-k+1];
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        res[0] = sum;
        for(int i=k; i<arr.length; i++){
            res[i-k+1] = res[i-k]+arr[i]-arr[i-k];
        }
        return res;
    }


}