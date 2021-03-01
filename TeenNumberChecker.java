/**
 * This exercise is to practice how to write method inside class
 * @author VuongChu
 *
 */
public class TeenNumberChecker{
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 9));
    }
     
    public static boolean hasTeen(int n1, int n2, int n3){
       if(isTeen(n1) ||  isTeen(n2) || isTeen(n3)) {
           return true;
       }else {
           return false;
       }
    }
    
    public static boolean isTeen(int n) {
        if(n>19 || n<13){
            return false;
        }else {
            return true;
        }
    }
}