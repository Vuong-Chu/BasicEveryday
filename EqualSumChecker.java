/**
 * This exercise is to practice how to write method inside class
 * @author VuongChu
 *
 */
public class EqualSumChecker{
    public static void main(String[] args) {
        System.out.println(hasEqualSum(-2,5,3));
    }
     
    public static boolean hasEqualSum(int n1, int n2, int result){
       if(n1+n2==result) {
           return true;
       }else {
           return false;
       }
    }
}