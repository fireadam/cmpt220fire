import java.util.Scanner;

public class Problem1 {  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        int num1s = (int)(Math.random()*10);
        int num2s = (int)(Math.random()*10);
        while (num1s < num2s){
            num1s = (int)(Math.random()*10);
            num2s = (int)(Math.random()*10);
        }
        int num1d = (int)(Math.random()*10);
        int num2d = (int)(Math.random()*10);
        while (num2d == 0){
            num2d = (int)(Math.random()*10);
        }
        System.out.println("Main Menu");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        int choice = input.nextInt();
        if (choice == 1){
            System.out.println("What is " + num1 + " + " + num2); 
            int ans = input.nextInt();
            if (ans == num1 + num2){
                 System.out.println("Correct");
            }
                else{
                System.out.println("Your answer is wrong. The correct answer is " + (num1 + num2));
            }
        }
        if (choice == 2){
            System.out.println("What is " + num1s + " - " + num2s); 
            int ans = input.nextInt();
            if (ans == num1s - num2s){
                System.out.println("Correct");
            }
                else{
                System.out.println("Your answer is wrong. The correct answer is " + (num1s - num2s));
            }
        }
        if (choice == 3){
            System.out.println("What is " + num1 + " * " + num2); 
            int ans = input.nextInt();
            if (ans == num1 * num2){
                System.out.println("Correct");
            }
                else{
                System.out.println("Your answer is wrong. The correct answer is " + (num1 * num2));
            }
        }
        if (choice == 4){
            System.out.println("What is " + num1d + "/" + num2d); 
            int ans = input.nextInt();
            if (ans == num1d / num2d){
                System.out.println("Correct");
            }
                else{
                System.out.println("Your answer is wrong. The correct answer is " + (num1d / num2d));
            }
        }
    }
}