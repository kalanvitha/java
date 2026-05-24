import java.util.Scanner;
public class larger {
    public static void main(String[] args){
        int a,b;//declare
        System.out.println("enter a and b values to compare");
        Scanner sc=new Scanner(System.in);//taking input from user
        a=sc.nextInt();//input from user storing in a and b
        b=sc.nextInt();
        int max=(a>b)?a:b;
        System.out.println("Larger "+max);
            sc.close();
        }
        }
    