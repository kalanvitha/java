import java.util.Scanner;
class Aoc{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of a circle");
        double r=sc.nextDouble();
        double area=3.14*r*r;
        System.out.println("area of the circle"+area);
        

    }
}