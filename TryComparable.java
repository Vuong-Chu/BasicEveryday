public class TryComparable {

    public static void main(String[] args){
        Date thisDate = new Date(2012,12,06);
        Date thatDate = new Date(2012,11,05);
        System.out.println(thisDate.compareTo(thatDate));
    }

}

class Date implements Comparable<Date>{
    private int year;
    private int month;
    private int day;
    public Date(int year, int month, int day){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int compareTo(Date that) {
        if(this.year < that.year) return -1;
        if(this.year > that.year) return 1;
        if(this.month < that.month) return -1;
        if(this.month > that.month) return 1;
        if(this.day < that.day) return -1;
        if(this.day > that.day) return 1;
        return 0;
    }
}

