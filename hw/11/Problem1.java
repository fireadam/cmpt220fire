import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int index = input.nextInt();
        System.out.print("Enter the weights for each item:  ");
        double[] weights = new double[index];
        for (int i = 0; i<index; i++){
            weights[i] = input.nextDouble();
        }
        System.out.print("Enter the weight limit for the bag: ");
        double lim = input.nextDouble();
        System.out.println("The maximum weight of the items placed in the bag is " + m(index, lim, weights));
    }

    public static double m(int i, double weightLimit, double[] w) {
        if (i == 0 || weightLimit == 0) // Base case
            return 0;
        if (w[i-1] > weightLimit) 
            return m(i-1, weightLimit, w); 
        else
            return max(m(i-1, weightLimit, w), w[i-1] + m(i-1, weightLimit-w[i-1], w)); 
    }
    
    public static double max(double x, double y){
        if (x>y)
            return x;
        else
            return y;
    }
}