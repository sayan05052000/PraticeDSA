public class GCD {
    public static int calcGCD(int n, int m){
        int a= Math.min(n, m);
        int b = Math.max(n,m);
        while(a!=0){
            int c = a;
            a=b%a;
            b=c;
        }
        return b;
    }
    public static void main(String[] args) {
        calcGCD(39,49);
    }
}
