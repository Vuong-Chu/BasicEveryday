class gcd_lcm{
    public static void main(String[] args) {
        System.out.println(gcd(5, 6));
        System.out.println(lcm(5, 6));
    }
    static int gcd(int a, int b){
        if(b==0) {
            return a;
        }
        return gcd(b,a%b);
    }
    
    static int lcm(int a, int b){
        int result = a*b/gcd(a,b);
        
        return result;
    }
}