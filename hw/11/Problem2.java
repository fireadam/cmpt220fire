import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {
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
        System.out.println("The maximum weight of the items placed in the bag is " + prob1(index, lim, weights));
        System.out.println("The items in the bag are #" + m(index, lim, weights).get(0) + " #" + m(index, lim, weights).get(1));
        System.out.println("The weights of the items in the bag are " + m3(index, lim, weights).get(0) + " " + m3(index, lim, weights).get(1));
    }

    //method from problem 1
    public static double prob1(int i, double weightLimit, double[] w) {
        if (i == 0 || weightLimit == 0) // Base case
            return 0;
        if (w[i-1] > weightLimit) 
            return prob1(i-1, weightLimit, w); 
        else
            return max(prob1(i-1, weightLimit, w), w[i-1] + prob1(i-1, weightLimit-w[i-1], w)); 
    }

    //methods to find item numbers
    public static double m1(int i, double weightLimit, double[] w, ArrayList<Integer> index) {
        if (i == 0 || weightLimit == 0) // Base case
            return 0;
        if (w[i-1] > weightLimit) {
            return m1(i-1, weightLimit, w, index); 
        }
        else{
            double m = max(m1(i-1, weightLimit, w, index), w[i-1] + m1(i-1, weightLimit-w[i-1], w, index));
            if (m < weightLimit && !index.contains(Integer.valueOf(i)))
                index.add(i);
            return m; 
        }
    }
    public static ArrayList<Integer> m(int i, double weightLimit, double[] w){
        ArrayList<Integer> index = new ArrayList<>();
        m1(i, weightLimit, w, index);
        return index;
    }

    //methods to find item weights
    public static double m2(int i, double weightLimit, double[] w, ArrayList<Double> index) {
        if (i == 0 || weightLimit == 0) // Base case
            return 0;
        if (w[i-1] > weightLimit) {
            return m2(i-1, weightLimit, w, index); 
        }
        else{
            double m = max(m2(i-1, weightLimit, w, index), w[i-1] + m2(i-1, weightLimit-w[i-1], w, index));
            if (m < weightLimit && !index.contains(Double.valueOf(i)))
                index.add(w[i-1]);
            return m; 
        }
    }
    public static ArrayList<Double> m3(int i, double weightLimit, double[] w){
        ArrayList<Double> index = new ArrayList<>();
        m2(i, weightLimit, w, index);
        return index;
    }

    //maximum method
    public static double max(double x, double y){
        if (x>y)
            return x;
        else
            return y;
    }
}