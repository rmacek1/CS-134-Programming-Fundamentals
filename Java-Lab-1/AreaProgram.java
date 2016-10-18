import java.util.Scanner;

public class AreaProgram
{
  
       public static void main(String args[])
    {
        Scanner scanner = new Scanner( System.in );
        
        System.out.println("Area and Perimeter Calculator");

        double width, length, area, perimeter;
        
        System.out.print("What is the width?");
        width = scanner.nextDouble();
        length = scanner.nextDouble();
        
        area = width * length;
        perimeter = 2 * width + 2 * length;
        
        System.out.println("Area:" + area);
        System.out.println("Perimeter:" + perimeter);
        
        scanner.close();
    }
}
