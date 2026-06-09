import java.util.Scanner;
public class perfect {
     public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*perfect number:
        sum(fact of num)=num
         */
        int sum=0;
         for(int i=1;i<n;i++){
             if(n%i==0){//check num divide with nums
                sum+=i;//sum that numbers
             }
         }
         if(sum==n){
            System.out.println("perfect");
         }else{
            System.out.println("not perfect");
         }
         sc.close();
     }
}