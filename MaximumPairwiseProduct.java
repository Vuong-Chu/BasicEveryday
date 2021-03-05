import java.util.Scanner;

public class MaximumPairwiseProduct {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
           array[i]=in.nextInt();
        }
        array = mergeSort(array);
        long mul1 = (long) array[0] * array[1];
        long mul2 = (long) array[n - 2] * array[n - 1];
        long max = Math.max(mul1,mul2);
        System.out.println(max);
    }

    public static int[] mergeSort(int[] x) {
        if(x.length == 1) {
            return x;
        }else {
            int l1 = (x.length/2);
            int l2 = x.length - l1;
            int[] a = new int[l1];
            int[] b = new int[l2];

            for(int i = 0; i< l1; i++) {
                a[i] = x[i];
            }

            for(int i = 0; i< l2; i++) {
                b[i] = x[i + l1];
            }
            return merge(mergeSort(a), mergeSort(b));
        }
    }

    public static int[] merge(int[] a, int[] b) {
        int[] x = new int[a.length + b.length];
        int j = 0;
        int k = 0;
        int i = 0;
        while(j < a.length && k < b.length) {
            if(a[j] <= b[k]) {
                x[i++] = a[j];
                j++;
            }else {
                x[i++] = b[k];
                k++;
            }
        }
        while(k < b.length) {
            x[i++] = b[k];
            k++;
        }
        while(j < a.length) {
            x[i++] = a[j];
            j++;
        }
        return x;
    }
}

