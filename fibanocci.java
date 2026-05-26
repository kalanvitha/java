import java.util.Scanner;
public class fibanocci{
    static void fib(int n){
    int a=0,b=1,c;
    for(int i=0;i<n;i++){
        System.out.println(a + " ");
        c=a+b;
        a=b;
        b=c;
    }
}
    public static void main(String[] args){
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);
        sc.close();
    }
}