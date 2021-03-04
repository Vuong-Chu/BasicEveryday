import java.util.Arrays;

public class InversionCounting {
    public static void main(String[] args) {
        
        int[] nums = {0,2,8,5,9,3,6,4,3,7,10,1,9,7};
        
        System.out.println(mergeSortAndCount(nums, 0, nums.length-1));

    }
    
    public static int mergeSortAndCount(int[] x, int l, int r) {
       int count = 0;
       if(l<r) {
           int m = (int) ((l+r)/2);
           
           count +=  mergeSortAndCount(x, l, m);
           
           count +=  mergeSortAndCount(x, m + 1, r);
           
           count +=  mergeAndCount(x, l, m, r);
       }
       return count;
    }
    
    public static int mergeAndCount(int[] x, int l, int m,  int r) {
        
        
        int[] a = Arrays.copyOfRange(x, l, m + 1); 
        int[] b = Arrays.copyOfRange(x, m + 1, r + 1);

        int count = 0;
        
        int j = 0;
        int k = 0;
        int i = l;
        while(j < a.length && k < b.length) {
                if(a[j] <= b[k]) {
                    x[i++] = a[j++];
                }else {
                    x[i++] = b[k++];
                    count += (m+1)-(l+j);
                }
        }
        while(k < b.length) {
                x[i++] = b[k++];
        }
        while(j < a.length) {
                x[i++] = a[j++];
        }
        
        return count;
    }
    
}
