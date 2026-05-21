import java.util.Scanner;
class Reverse{
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int rev=0;
   while(n>0){
    int digits=n%10;//gets a last digit by  %
    rev=rev*10+digits;//last digit stores in the rev variable
    n=n/10;//removes the last variable and store the starting digits
   }
   System.out.println(rev);
   sc.close();
  }
}
