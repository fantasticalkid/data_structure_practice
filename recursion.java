public class recursion {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int p = power(x,n/2);
        int r = p*p;

        if( n % 2 == 1){
            r = r * x;
        }

        return r;

    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(power(2,i));
        }
        
    }
}
