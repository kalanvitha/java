import java.util.Scanner;
public class largestofthreenumber {
    public static void main(String[] args){
        int a,b,c;//declare
        System.out.println("enter a,b, values to compare");
        Scanner sc=new Scanner(System.in);//taking input from user
        a=sc.nextInt();//input from user storing in a,b,c
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is largest number "+a );
        }
        else if(b>c && b>a){
            System.out.println("b is largest number "+b);
        }
        else{
            System.out.println("c is largest number "+c);
        }
            sc.close();
        }
        }
        

