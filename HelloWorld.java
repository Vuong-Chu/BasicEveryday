/**
 * This code is to print out a string to the screen
 * @author vuongchu
 *
 */
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class HelloWorld {
    public static void main(String[] args) {
        String a = StdIn.readString();
        String b = StdIn.readString();
        StdOut.printf("Hello %s and %s.\n",a,b);
        StdOut.printf("Goodbye %s and %s.",b,a);
    }
}
