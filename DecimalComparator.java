/**
 * This exercise is to practice how to write method inside class
 * @author VuongChu
 *
 */
public class DecimalComparator{
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
    
    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2){
        if((int)(n1*1000)==(int)(n2*1000)) {
            return true;
        }else {
            return false;
        }
    }
}