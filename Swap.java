import java.util.Scanner;
public class Swap {
       public static void main(String[] args){
        System.out.println("enter numbers to swap");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping the numbers ");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        sc.close();
       }
}
