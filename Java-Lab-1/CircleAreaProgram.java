import java.util.Scanner;

public class CircleAreaProgram
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Circle Area Calculater");
        
        double pi = 3.14;
        double r;
        double area;
        
        System.out.println("What is the radius?");
        
        r = scanner.nextDouble();

        area = pi * Math.pow(r, 2);
        
        System.out.println("Area:" + area);
       
        scanner.close();
    }
  
}