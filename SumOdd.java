/**
 * This exercise is to practice how to write method inside class
 * @author VuongChu
 *
 */
public class SumOdd{
    public static void main(String[] args) {
        System.out.print(sumOdd(150,223));
    }
     
  public static boolean isOdd(int num) {
     if(num<=0) {
         return false;
     }else {
         if(num%2==1) {
             return true;
         }else {
             return false;
         }
     }
  }
  public static int sumOdd(int start, int end) {
      if(start>end || (start<0 || end<0)) {
          return -1;
      }else {
          int sum=0;
          for(int i=start;i<=end;i++) {
              if(isOdd(i)) {
                  sum+=i;
              }
          }
          return sum;
      }
  }
}