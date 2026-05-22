import java.util.Scanner;
public class larger {
    public static void main(String[] args){
        int a,b;//declare
        System.out.println("enter a and b values to compare");
        Scanner sc=new Scanner(System.in);//taking input from user
        a=sc.nextInt();//input from user storing in a and b
        b=sc.nextInt();
        if(a>b){
            System.out.println("a is larger number "+a );
        } else{
            System.out.println("b is larger number "+b);
            sc.close();
        }
        }
        
}
