import java.util.*;

public class Enum {

    public static void main(String[] args) {
        System.out.println(Season.WINTER);
        Season.WINTER.printExpectedVisitors();
    }

}

enum Season{
        WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
        private String expectedVisitors;
        private Season(String expectedVisitors) {
            this.expectedVisitors = expectedVisitors;
        }
        public void printExpectedVisitors() {
            System.out.println(expectedVisitors);
        }
}

