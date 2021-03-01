/**
 * This exercise is to practice how to write method inside class
 * @author VuongChu
 *
 */
public class MinutesToYearDayCalculator{
    public static void main(String[] args) {
        printYearsAndDays(1440);
    }
     
  public static void printYearsAndDays(long minutes) {
      if(minutes<0) {
          System.out.println("Invalid Value");
      }else {
          System.out.printf("%d min = %d y and %d d\n", minutes, minutes/60/24/365, minutes/60/24%365);
      }
  }
    
}