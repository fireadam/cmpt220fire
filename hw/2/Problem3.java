import java.util.Scanner;

public class Problem3 {  
    public static void main(String[] args){
        Scanner f = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the friction force in Newtons: ");
        double force = f.nextDouble();
        System.out.print("Enter the object’s mass in kg: ");
        double mass = m.nextDouble();
        System.out.print("Enter the object’s acceleration in m/s^2: ");
        double acc = a.nextDouble();
        double coeff = (force-(mass*acc))/(9.8*mass);
        System.out.println("The coefficient for friction is " + coeff );
    }
}