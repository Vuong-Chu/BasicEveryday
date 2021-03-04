public class PermutateS {
    public static void main(String[] args){
        String s = "abc";
        permu(s,0,s.length()-1);
    }
    public static void permu(String s, int l, int r) {
        if(l==r) {
            System.out.println(s);
        }else {
            for(int i=l; i<=r; i++) {
                s = swap(s,l,i);
                permu(s,l+1,r);
                s = swap(s,l,i);
            }
        }
    }
    public static String swap(String s, int i, int j) {
        char[] w = s.toCharArray();
        char temp = w[i];
        w[i] = w[j];
        w[j] = temp;
        return String.valueOf(w);
    }
}