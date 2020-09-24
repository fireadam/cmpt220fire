import java.util.Scanner;

public class Problem1 {  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a numerator: ");
        double num = input.nextDouble();
        System.out.print("Enter a denominator: ");
        double den = input.nextDouble();
        double fraction = num/den;
        int num1 = (int)num;
        int den1 = (int)den;
        if (fraction < 1){
            System.out.println(num1 + "/" + den1 + " is a proper fraction");
        }
        if (fraction >= 1 && fraction % 1 != 0){
            int frac = num1-((num1/den1)*den1);
            System.out.println(num1 + "/" + den1 + " is an improper fraction and its mixed fraction is " + num1/den1 + " + " + frac + "/" + den1);
        }
            else if (fraction % 1 == 0){
            System.out.println(num1 + "/" + den1 + " is an improper fraction and and it can be reduced to " + num1/den1);
        }

    }
}