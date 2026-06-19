package Arrays;
import java.util.Scanner;
public class ArrayZerosOnes {
    public static void main(String[] args) {
        System.out.println("enter size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int i=0;
        for(int j=0;j<a.length;j++){
            if(a[j]==0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }
        }
        System.out.println("sorted array");
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]+ " ");
        }
        sc.close();
    }
}
