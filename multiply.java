import java.util.Arrays;

public class multiply {
    public static void main(String[] args) {
        int a = 123456;
        int b = 3569;
        
        System.out.println(multiplied(a,b));
        
        
    }
    public static int multiplied(int a, int b) {
        int n = getSize(a);
        int m = getSize(b);
        int N = Math.max(n, m);
        if(N == 1) {
            return a*b;
        }
        
        int k = (int) Math.pow(10, N/2 + N%2);
        
        int a1 = a/k;
        int a2 = a%k;
        int b1= b/k;
        int b2 = b%k;
        
        int p1 = multiplied(a1, b1);
        int p2 = multiplied(a2, b2);
        int p3 = multiplied(a1+a2,b1+b2);
        
        return p1*(int) Math.pow(10, 2*(N/2 + N%2)) + (p3-p2-p1)*k + p2;
    }
    public static int getSize(int x) {
        int count = 0;
        while(x != 0) {
            count++;
            x /= 10;
        }
        return count;
    }
}
