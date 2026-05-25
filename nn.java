import java.util.Scanner;
public class nn {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int i=0;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}
