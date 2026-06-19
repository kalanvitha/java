package Arrays;
import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        System.out.println("enter array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int i=0;
        int j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println("Reversed array");
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]+ " ");
        }
        sc.close();
    }
}
