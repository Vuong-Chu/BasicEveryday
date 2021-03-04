import java.util.Scanner;

public class findDayInDigit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int day = Integer.parseInt(s.substring(0, s.indexOf('/')));
        String s2 = s.substring(s.indexOf('/')+1);
        int month = Integer.parseInt(s2.substring(0, s2.indexOf('/')));
        int year = Integer.parseInt(s2.substring(s2.indexOf('/')+1));
        
        DayInDigit(day,month,year);
    }
    
    public static void DayInDigit(int d, int m, int y) {
        int total = 0;
        
        if(y>2000) {
            int n = y-2000;
            for(int i=0;i<n;i++) {
                int[] arr = checkLeap(2000+i);
                total += arr[0];
            }
            int[] arr = checkLeap(y);
            if(m>1) {
                for(int i=1; i<m; i++) {
                    total += arr[i];
                }
            }
            total = total + d - 1;
        }else if(y==2000) {
            int[] arr = checkLeap(2000);
            if(m>1) {
                for(int i=1; i<m; i++) {
                    total += arr[i];
                }
            }
            total = total + d - 1;
        }

        int k = (total+6)%7;
        String s = d+"/"+m+"/"+y;
        
        switch(k) {
        case 0: 
            System.out.println(s+" is a Sunday");
            break;
        case 1: 
            System.out.println(s+" is a Monday");
            break;
        case 2: 
            System.out.println(s+" is a Tuesday");
            break;
        case 3: 
            System.out.println(s+" is a Wednesday");
            break;
        case 4: 
            System.out.println(s+" is a Thursday");
            break;
        case 5: 
            System.out.println(s+" is a Friday");
            break;
        case 6: 
            System.out.println(s+" is a Saturday");
            break;
        }
    }
    
    public static int[] checkLeap(int y) {
        int[] mm;
        if(y%400==0 || (y%4==0 && y%100!=0)) {
            mm = new int[]{366,31,29,31,30,31,30,31,31,30,31,30,31};
        }else {
            mm = new int[]{365,31,29,31,30,31,30,31,31,30,31,30,31};
        }
        return mm;
    }
}