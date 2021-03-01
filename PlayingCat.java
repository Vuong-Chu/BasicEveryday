/**
 * This exercise is to practice how to write method inside class
 * @author VuongChu
 *
 */
public class PlayingCat{
    public static void main(String[] args) {
        isCatPlaying(true, 27);
    }
     
  public static boolean isCatPlaying(boolean summer, int temperature) {
      if(summer) {
          if(temperature >= 25 && temperature <= 45) {
              return true;
          }else {
              return false;
          }
      }else {
          if(temperature >= 25 && temperature <= 35) {
              return true;
          }else {
              return false;
          }
      }
  }
    
}