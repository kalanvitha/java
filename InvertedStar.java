import java.util.Scanner;
public class InvertedStar {
    public static void main(String[] args) {
        System.out.println("enter  number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){//rows
            for(int k=1;k<=i-1;k++){//spaces
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){//stars
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

