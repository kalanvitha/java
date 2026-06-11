import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        System.out.println("enter values");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=a;
        int y=b;
        while(y!=0){
          int temp=y;
          y=x%y;
          x=temp;
        }
        int gcd=x;
        int lcm=(a*b)/gcd;
        System.out.println("gcd of number" +gcd);
        System.out.println("lcm of number "+lcm);
        sc.close();
    }
}
