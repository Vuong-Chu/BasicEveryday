import java.util.Arrays;

public class Max_Subarray {

    public static void main(String[] args) {
        int[] nums = {100, 113, 110, 85, 105, 102, 86, 63, 81, 101, 94, 106, 101, 79, 94, 90, 97};
        
        int[] nums2 = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        
        System.out.println(brute_force(nums));
        System.out.println(max_subarray(nums2,0,nums2.length-1));
        System.out.println(maxSubarray(nums2));
    }
    
    public static int brute_force(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length-1; i++) {
            int sum = 0;
            for(int j=i+1;j<nums.length;j++) {
                sum = nums[j] - nums[i];
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
    
    public static int max_subarray(int[] nums, int l, int h) {
        if(h == l) {
            return nums[l];
        }
        else {
            int m = (int)((l+h)/2);
        
            int maxLeft = max_subarray(nums, l, m);
        
            int maxRight = max_subarray(nums, m+1, h);
        
            int maxCross = max_crossingSubarray(nums, l, m, h);
        
        if(maxLeft >= maxCross && maxLeft >= maxRight) {
            return maxLeft;
        }
        else if(maxRight >= maxCross && maxRight >= maxLeft) {
            return maxRight;
        }
        else {
            return maxCross;
        } 
            }
    }
    
    public static int max_crossingSubarray(int[] nums, int l, int m, int h) {
        int left_sum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=m; i>=l; i--) {
            sum += nums[i];
            if(sum > left_sum) {
                left_sum = sum;
            }
        }
        
        
        int right_sum = Integer.MIN_VALUE;
        sum = 0;
        for(int i=m+1; i<=h; i++) {
            sum += nums[i];
            if(sum > right_sum) {
                right_sum = sum;
            }
        }
        
        return (left_sum + right_sum);
    }
    
    
    public static int maxSubarray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            sum = sum + nums[i];
            if(sum < 0) {
                sum = 0;
            }
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
