//Given n calculate F(n).
public class Main {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int a=0,b=1;
        for(int i=2;i<=n;i++){
            int temp=a+b;
            a=b;
            b=temp;
        }
        return b;
    }
}