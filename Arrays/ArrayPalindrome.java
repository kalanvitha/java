package Arrays;
import java.util.Scanner;
public class ArrayPalindrome {
    public static void main(String[] args) {
        System.out.println("enter numner");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int i=0;
        int j=a.length-1;
        boolean ispalindrome=false;
        while(i<j){
            if(a[i]==a[j]){
                ispalindrome=true;
                break;
            }
            i++;
            j--;
        }
        if(ispalindrome){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
