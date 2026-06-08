import java.util.Scanner;
class primes{
 static boolean isprime(int n){
  int i;
  if(n<=1)
	  return false;
  if(n==2)
	  return true;
  if(n%2==0) 
	 return false;
  for(i=3;i*i<=n;i=i+2){
  if(n%i==0)
  return false;
  }
  return true;
 }
 public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
      int n=sc.nextInt();
  if(isprime(n)){
  System.out.println("prime");
}
else{
System.out.println("not prime");  
}
sc.close();

}
}