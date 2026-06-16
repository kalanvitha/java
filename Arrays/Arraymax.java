package Arrays;
import java.util.Scanner;
public class Arraymax {
   static void maxi(int a[]){
      int max=a[0];
     for(int i=0;i<a.length;i++){
        if(a[i]>max){
            max=a[i];
        }
     }
     System.out.println("max element in array " +max);
   }
   public static void main(String[] args) {
   System.out.println("enter array size");
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int a[]=new int[n];
     for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
     }
        maxi(a);
        sc.close();
   }
}
