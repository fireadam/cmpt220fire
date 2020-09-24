import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.println("What is " + number1 + " - " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (number1 - number2 == answer){
            int correct = (int)(Math.random() * 3);
            if (correct == 0){
                System.out.println("Correct!"); 
            }
            else if (correct == 1){
                System.out.println("Excellent!"); 
            }
            else{
                System.out.println("Way to go!"); 
            }
        }
        else {
            int wrong = (int)(Math.random() * 3);
            if (wrong == 0){
                System.out.println("Wrong!"); 
            }
            else if (wrong == 1){
                System.out.println("Not right."); 
            }
            else{
                System.out.println("Incorrect"); 
            }
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }
    }
}
