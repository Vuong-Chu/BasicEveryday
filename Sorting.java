import java.util.Arrays;

public class Sorting {
    
    public static void main(String[] args) {
        
        int[] nums = {0,2,8,5,9,3,6,4,3,7,10,1,9,6};
        
        
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(insertionSort(nums)));
        System.out.println(Arrays.toString(selectionSort(nums)));
        System.out.println(Arrays.toString(bubbleSort(nums)));
        System.out.println(Arrays.toString(mergeSort(nums)));
        System.out.println(Arrays.toString(quickSort(nums, 0, nums.length-1)));
        countingSort(nums);
        }
        
    
    public static int[] insertionSort(int[] x) {
        for(int i=0; i< x.length-1; i++) {
            int j = i;
            while(j >= 0) {
                if(x[j] > x[j+1]) {
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp; 
                }
                j--;
            }
        }
        return x;
    }
    
    public static int[] selectionSort(int[] x) {
        int min = x[0];
        int pos = 0;
        for(int i=0; i<x.length-1; i++) {
            for(int j=i+1; j<x.length; j++) {
                if(x[j] < x[i]) {
                    min = x[j];
                    pos = j;
                }
            }
            x[pos] = x[0];
            x[0] = min;
        }
        return x;
    }
    
    public static int[] bubbleSort(int[] x) {
        for(int i=0; i<x.length; i++) {
            for(int j=0; j<x.length-1; j++) {
                if(x[j] > x[j+1]) {
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
                
            }
        }
        return x;
    }
    
    public static int[] mergeSort(int[] x) {
        if(x.length == 1) {
            return x;
        }else {
            int l1 = (int) (x.length/2);
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
    
    public static int[] quickSort(int[] arr, int l, int r) {
        if(l>=r) {
            return arr;
        }
        int j = partition(arr, l, r);
        quickSort(arr, l, j-1);
        quickSort(arr, j+1, r);
        return arr;
    }
    
    public static int partition(int[] arr, int l, int r) {
        
        int key = arr[l];
        int i = l;
        int j = r+1;
        while(true) {
            while(key > arr[++i]) {
                if(i==r) {
                    break;
                }
            }
            while(key < arr[--j]) {
                if(j==l) {
                    break;
                }
            }
            if(i >= j) {
                break;
            }
            exchange(arr, i, j);
        }
        exchange(arr, l, j);
        return j;
    }
    
    public static void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void countingSort(int[] arr) {
        int[] temp = new int[100];
        
        for(int i=0; i<arr.length; i++) {
            int a = arr[i];
            temp[a] += 1;
        }
        
        for(int i=0; i<100; i++) {
            if(temp[i] != 0) {
                for(int j=0; j<temp[i]; j++) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}