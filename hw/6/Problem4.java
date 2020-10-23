public class Problem4 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a, b, c, d: ");
        double[][] mat = new double[2][2];
        mat[0][0] = input.nextDouble();
        mat[1][0] = input.nextDouble();
        mat[0][1] = input.nextDouble();
        mat[1][1] = input.nextDouble();
        inverse(mat);
    }
    public static double[][] inverse(double[][] A){
        double a = A[0][0];
        double b = A[1][0];
        double c = A[0][1];
        double d = A[1][1];
        double coeff = 1.0/((a*d)-(b*c));
        double[][] newarray = new double[2][2];
        newarray[0][0] = coeff * d;
        newarray[1][0] = coeff * -b;
        newarray[0][1] = coeff * -c;
        newarray[1][1] = coeff * a;
        if (a*d-b*c == 0)
            System.out.print("No inverse matrix ");
        else
            System.out.println(newarray[0][0] + " " + newarray[1][0]);
            System.out.println(newarray[0][1] + " " + newarray[1][1]);
            return newarray;
    }
}
