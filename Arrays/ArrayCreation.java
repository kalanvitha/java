package Arrays;
import java.util.Scanner;
public class ArrayCreation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
         int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();     
    }
   
}
