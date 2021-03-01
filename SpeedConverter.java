/**
 * This exercise is to practice how to write method inside class
 * We distinguish between void and return type.
 * @author VuongChu
 *
 */
public class SpeedConverter{
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        printConversion(1.5);
    }
    
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour<0) {
            return -1;
        }else {
            return (Math.round(kilometersPerHour/1.609));
        }
    }
    
    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour<0) {
            System.out.println("Invalid Value");
        }else {
            System.out.printf("%s km/h = %d mi/h",kilometersPerHour,Math.round(kilometersPerHour/1.609));
        }
    }
}