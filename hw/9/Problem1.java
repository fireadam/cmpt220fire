import java.util.Random;
public class Problem1 {  
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter an index of the array: ");
        Random r = new Random(); 
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
           array[i] = r.nextInt(); 
        }
        int inp = input.nextInt();
        if (inp>99 || inp < 0){
            System.out.print("Out of bounds");
        }
        else {
            System.out.print("Your number is " + array[inp]);
        }
    }
}