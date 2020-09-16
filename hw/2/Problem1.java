import java.util.Scanner;

public class Problem1 {  
    public static void main(String[] args){
        Scanner w = new Scanner(System.in);
        Scanner h = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle:");
        double width = w.nextDouble();
        System.out.print("Enter the height of the rectangle:");
        double height = h.nextDouble();
        double perim = 2 * width + 2 * height;
        double area = width * height;
        double ld = Math.sqrt(Math.pow(width,2) + Math.pow(height,2));
        System.out.println("The perimeter is " + perim);
        System.out.println("The area is " + area);
        System.out.println("The length of the diagonal is " + ld);
    }
}