package Arrays;
import java.util.Scanner;
class ArrayZerosatEnd {

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
            if(a[j]!=0){//if not equal swap with zero index,if equal to zero ignore
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              i++;
            }
        }
        System.out.println("elements are ");
        for( int x=0;x<a.length;x++){
         System.out.println(a[x]+ " ");
        }
        sc.close();
    }
}