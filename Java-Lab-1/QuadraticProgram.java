import java.util.Scanner;

public class QuadraticProgram{
 public static void main(String args[])
    {
        Scanner scanner = new Scanner( System.in );
        
        System.out.println("QUADRATIC CALCULATOR");
        System.out.println("ax^2 + bx + c");
        
        double a, b, c;
        double x1, x2;
 
        System.out.println("What is a?");
        a = scanner.nextDouble();
        System.out.println("What is b?");
        b = scanner.nextDouble();
        System.out.println("What is c?");
        c = scanner.nextDouble();
        x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2 *a);
        
        System.out.println( "x1 =" + x1);
        System.out.println( "x2 = " +x2);

     

        scanner.close();
    }
}
