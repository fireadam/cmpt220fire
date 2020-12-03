public class Project4 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        //first complex number parts
        System.out.println("Enter the first complex number: ");
        double a = input.nextDouble();
        double b = input.nextDouble();

        //second complex number parts
        System.out.println("Enter the second complex number: ");
        double c = input.nextDouble();
        double d = input.nextDouble();

        Complex num1 = new Complex(a,b);
        Complex num2 = new Complex(c,d);

        //Output
        System.out.println("(" + a + " + " + b + "i)" + " + " + "(" + c + " + " + d + "i) = " + num1.add(num2));
        System.out.println("(" + a + " + " + b + "i)" + " - " + "(" + c + " + " + d + "i) = " + num1.subtract(num2));
        System.out.println("(" + a + " + " + b + "i)" + " * " + "(" + c + " + " + d + "i) = " + num1.multiply(num2));
        System.out.println("(" + a + " + " + b + "i)" + " / " + "(" + c + " + " + d + "i) = " + num1.divide(num2));
        System.out.println("|" + a + " + " + b + "i| = " + num1.abs());
    }
}
