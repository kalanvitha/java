import java.util.Scanner;
public class armstrong{
    public static void main(String[] args){
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int temp=n;
        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;

        }
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=(int)Math.pow(d,count);
            n=n/10;
        }
        if(sum==original){
            System.out.println("armstrong");
        }else{
            System.out.println("Not armstrong");
        }
        sc.close();
    }
}