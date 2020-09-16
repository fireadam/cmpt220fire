import java.util.Scanner;

public class Problem4 {  
    public static void main(String[] args){
        Scanner c1 = new Scanner(System.in);
        Scanner c2 = new Scanner(System.in);
        Scanner c3 = new Scanner(System.in);
        Scanner c4 = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = c1.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = c2.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = c3.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = c4.nextDouble();
        double slope = (y2-y1)/(x2-x1);
        System.out.println("The slope for the line that connects two points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 +") is " + slope );
    }
}