import java.util.Scanner;

public class Problem1 {  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        decimalToBinary(num);
    }
    public static String decimalToBinary(int value){
        String p = "";
        String s;
        while (value>0){
            if (value % 2 == 0){
                s = "0";
                p = s + p;
            }
            else{
                s = "1";
                p = s + p;
            }
            value = value/2;  
        }
        System.out.print("The binary value is " + p);
        return p;
    }
}