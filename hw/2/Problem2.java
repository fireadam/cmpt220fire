import java.util.Scanner;

public class Problem2 {  
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the ball travel time in seconds: ");
        double time = t.nextDouble();
        double d = 9.8 * (Math.pow(time,2)/2.0);
        System.out.println("The height of the building is " + d + " meters.");
    }
}