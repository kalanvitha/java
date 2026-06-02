
import java.util.Scanner;
public class posnegzero {
    static void  checknumber(int n){
        if(n>0){
            System.out.println("Positive number");
        }else if(n<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Zero");
        }
    }
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checknumber(n);
        sc.close();
    }
}
