import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        int rev=0,original;
        int d;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        original=n;
        while(n!=0){
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(rev==original){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
        sc.close();
    }
}
