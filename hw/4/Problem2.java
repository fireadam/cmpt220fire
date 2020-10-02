import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the sides: ");
        int sides = input.nextInt();
        System.out.print("Enter the radius of the bounding circle: ");
        int r = input.nextInt();
        System.out.println("The coordinates of the points on the polygon are");
        int i;
        for (i = 0; i < sides; i++) {
            System.out.println("(" + r * Math.cos((2 * Math.PI * i) / sides) + "," + r * Math.sin((2 * Math.PI * i) / sides) + ")");
        }
    }
}