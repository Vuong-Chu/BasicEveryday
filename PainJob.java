/**
 * This exercise is to practice how to write overloaded methods inside class
 * @author VuongChu
 *
 */
public class PainJob{
    public static void main(String[] args) {
        
        getBucketCount(2.6,4.1,1.5,1);
        getBucketCount(2.6,4.1,1.5);
        getBucketCount(2.6,1.5);
        
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(getBucketCount(width, height, areaPerBucket)==-1 || extraBuckets<0) {
            return -1;
        }else {
            return (getBucketCount(width, height, areaPerBucket)-extraBuckets);
        }
    }
    
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width<=0 || height<=0 || areaPerBucket<=0) {
            return -1;
        }else {
            return (int) (Math.ceil(width*height/areaPerBucket));
        }
    }
    
    public static int getBucketCount(double area, double areaPerBucket) {
        if(area<=0 || areaPerBucket<=0) {
            return -1;
        }else {
            return (int) (Math.ceil(area/areaPerBucket));
        }
    }
 
}