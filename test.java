
public class test {

    public static long FF(long n) throws IllegalArgumentException{
        if(n<0){
            throw new IllegalArgumentException();
        }
        else if(n==0){
            return 1;
        }
        return n*FF(n-1);
    }

    public static long FF0(long n){
        long t=n;
        for (int i = 1; i < t; i++) {
            n=n*i;
        }
        return n;

    }

    public static void main(String[] args) {
        double start1 = System.currentTimeMillis();
        System.out.println(FF(-1));
        double end1 = System.currentTimeMillis();
        System.out.println(start1);
        System.out.println(end1);

        double start2 = System.currentTimeMillis();
        
        System.out.println(FF0(20));
        double end2 = System.currentTimeMillis();
        System.out.println(end2);

        
        

    
    }
}

    

