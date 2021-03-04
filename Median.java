class Median{
    public static void main(String[] args) {
        int[] arr = {5, 1, 6, 4, 8, 9, 7, 10, 2, 3};
        
        System.out.println(median(arr,0,arr.length-1,9));
        
    }
    
    static int median(int[] arr, int l, int r, int pos) {
        if(l>=r) {
            return arr[l];
        }

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
        
        if(pos>j) {
            return median(arr,j+1,r,pos);
        }else if(pos<j) {
            return median(arr,l,j-1,pos);
        }else {
            return arr[j];
        }
    }
    static void print(int[] arr) {
        for(int each: arr) {
            System.out.print(each+" ");
        }
    }
    static void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}



