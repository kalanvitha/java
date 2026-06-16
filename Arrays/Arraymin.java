package Arrays;
import java.util.Scanner;
public class Arraymin {
    static void mini(int a[]){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("min element in array "+min);
    }
    public static void main(String[] args) {
        System.out.println("enter array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        mini(a);
        sc.close();
    }
}
