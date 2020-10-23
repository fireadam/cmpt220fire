public class Problem1 {  
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter 6 points in clockwise order (Separated by spaces like x y): ");
        double[] x = new double[6];
        double[] y = new double[6];
        //Create Arrays
        for (int i = 0; i<6; i++){
            x[i] = input.nextDouble();
            y[i] = input.nextDouble();
        }
        //Find Area
        double sum = 0;
        for (int j = 0; j<5; j++){
            sum = sum + ((x[j]*y[j+1]-x[j+1]*y[j])/2.0);
            if (j==4){
                sum = sum + ((x[5]*y[0]-x[0]*y[5])/2.0);
                if (sum < 0)
                    System.out.print("The area is " + (-sum));
                else
                    System.out.print("The area is " + sum);
            }
        }
    }
}