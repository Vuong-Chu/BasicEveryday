import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This exercise is to practice how to write method get input and print out results
 * @author VuongChu
 *
 */
public class InputCalculator{
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true) {
            try{
                int num = in.nextInt();
                sum+=num;
                count++;
            }catch(InputMismatchException e){
                if(count!=0) {
                    System.out.printf("SUM = %d AVG = %d \n", sum, (int) Math.ceil(sum*1.0/count));
                    return;
                }else {
                    System.out.printf("SUM = 0 AVG = 0 \n");
                    return;
                }
            }
        }
    }
}