/**
 * This code is to review the class, constructor and inheritence.
 * @author vuongchu
 *
 */

public class SimpleCalculator{
    public static void main(String[] args) {
        Calculator sc = new Calculator();
        sc.setFirstNumber(5.5);
        sc.setSecondNumber(3.1);
        System.out.println(sc.toString());
        System.out.println(sc.getAdditionResult());
        System.out.println(sc.getSubtractionResult());
        System.out.println(sc.getMultiplicationResult());
        System.out.println(sc.getDivisionResult());
        
    }
}
class Calculator{
    private double firstNumber;
    private double secondNumber;
    public double getFirstNumber() {
        return firstNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    
    public double getAdditionResult() {
        return firstNumber+secondNumber;
    }
    public double getSubtractionResult() {
        return firstNumber-secondNumber;
    }
    public double getMultiplicationResult() {
        return firstNumber*secondNumber;
    }
    public double getDivisionResult() {
        if(secondNumber==0) {
            return 0;
        }else {
            return firstNumber/secondNumber;
        }
        
    }
    public String toString() {
        return String.format("[1st number: %.2f, 2nd number: %.2f]", firstNumber, secondNumber);
    }
    
}