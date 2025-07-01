//Reversing the number
public class Main {
    public static void main(String[] args) {
        System.out.println( ReverseNumber(0));
    }
    public static int ReverseNumber(int n){
        int revNum=0;
        while(n!=0){
            int lastDigit=n%10;
            revNum=revNum*10 + lastDigit;
            n=n/10;
        }
        return revNum;
    }
}