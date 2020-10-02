import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int root = input.nextInt();
        boolean done = false;
        for (int x = 1; x < root; x++)
            if (x * x == root){
                System.out.print("sqrt(" + root +") is " + x);
                done = true;
            }
        if (!done){
            for (int x = root; x >= 2; x--)
                for (int y = 2; y < root; y++)
                    if ((x * x) == (root/y) && root % y == 0){
                        System.out.print("sqrt(" + root +") is " + x + "*sqrt(" + y + ")");
                        System.exit(0);
                    }
        } 
        System.out.println("sqrt(" + root +") is sqrt(" + root + ")");    
    }
}
