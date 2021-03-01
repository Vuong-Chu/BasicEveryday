/**
 * This exercise is to practice how to write method inside class (Overloaded)
 * @author VuongChu
 *
 */
public class AreaCalculator{
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(5,4));
    }
     
    public static double area(double radius){
        if(radius<0) {
            return -1.0;
        }else {
            return Math.pow(radius, 2)*Math.PI;
        }
    }
    
    public static double area(double x, double y) {
        if(x<0 || y<0) {
            return -1.0;
        }else {
            return x*y;
        }
    }
    
}
