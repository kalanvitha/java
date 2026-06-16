package Arrays;
import java.util.Scanner;
public class CheckSorted {
static void isSorted(int a[]){
    boolean isSorted=true;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
           
        }
    }
    public static void main(String[] args) {
        System.out.println("enter array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        isSorted(a);
        sc.close();
    }
}
