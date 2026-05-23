import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("The given number is even number");
        }
            else{
                System.out.println("The given number is odd number");
            }
            sc.close();
        }
    }

