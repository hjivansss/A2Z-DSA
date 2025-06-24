
public class Main {
    public static void main(String[] args) {
        pattern14(5);
    }
    public static void pattern1(int n){
        for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print("* ");
                }
                System.out.println();

        }
    }
    public static void pattern2(int n){
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j <= i+1; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        int c=1;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(c);
            }
            System.out.println();
            c=c+1;
        }
    }
    public static void pattern5(int n){
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n-i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <n-i; j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    //imp
    public static void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*(n-i)-1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        pattern7( n);
        pattern8(n);
    }
    //imp
    public static void pattern10(int n){
        for(int i=1;i<2*n;i++){
            int stars=i;
            if(i>n){stars=2*n-i;}
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //imp
    public static void pattern11(int n){
        int start=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){start=0;}
            else{start=1;}
            for(int j=1;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //spaces
            for(int j=2*n-2*i+1;j>=2;j--){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();

        }
    }
    public static void pattern13(int n){
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count + " ");
                count+=1;
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){

    }
}
