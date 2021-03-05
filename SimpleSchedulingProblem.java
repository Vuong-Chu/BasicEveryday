/**
 * We are given jobs j1, j2, . . . , jN, all with known running times t1, t2, . . . , tN, respectively.
 * We have a single processor. What is the best way to schedule these jobs in order to minimize the average completion time? In this entire section, we will assume nonpreemptive
 * scheduling: Once a job is started, it must run to completion.
 * @author: VuongChu
 */

import java.util.Arrays;
import java.util.Scanner;

public class SimpleSchedulingProblem {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int[] cumsumArr = new int[n];
        cumsumArr[0] = arr[0];
        for(int i=1;i<n;i++) {
            cumsumArr[i] += arr[i] + cumsumArr[i - 1];
        }
        int sum = 0;
        for(int value : cumsumArr){
            sum+=value;
        }
        System.out.println(sum*1.0/n);
    }
}
