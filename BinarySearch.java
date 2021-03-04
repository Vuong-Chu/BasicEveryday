
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 9, 10, 11, 15, 20, 26};
        
      
        
        System.out.println(binarySearch1(arr, 2));
        System.out.println(binarySearch2(arr, 27, 0, arr.length-1));
    }
    
    public static int binarySearch1(int[] arr, int value) {
        int begin = 0;
        int end = arr.length-1;
        int result=0; //return the insert point
        
        while(end >= begin) {
            int mid = (end + begin)/2;
            result = mid;
            if(arr[mid] == value) {
                return mid;
            }
            else if(value > arr[mid]) {
                begin = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -result-1;
    }
    
    public static int binarySearch2(int[] arr, int value, int begin, int end) {
        if(end<begin) {
            return -1;
        }
        if(end==begin) {
            if(value == arr[begin]) {
                return begin;
            }else {
                return -1;
            }
        }else {
            int mid = (end+begin)/2;
            if(arr[mid] == value) {
                return mid;
            }
            else if(arr[mid] > value) {
                return binarySearch2(arr, value, 0, mid-1);
            }else {
                return binarySearch2(arr, value, mid+1, end);
            }
        }
    }
}
