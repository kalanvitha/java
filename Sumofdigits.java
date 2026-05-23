import java.util.Scanner;
public class Sumofdigits {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int digit;
    int sum=0;
    int n=sc.nextInt();
    while(n>0){
        digit=n%10;
        sum+=digit;
        n=n/10;
      
    }
    System.out.println("sum of the digits: " + sum);
    sc.close();
    }
}
