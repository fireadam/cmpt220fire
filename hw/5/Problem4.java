import java.util.Scanner;

public class Problem4 {  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        for (int i = 0; i<=rows; i++){
            for (int k = 0; k<=rows-i; k++){
                System.out.print(" ");
            }
            for (int j = 0; j<=i; j++){
                ncr(i,j);
            }
            System.out.println("");
        }
    }
    public static void ncr(int m, int n){
        if ((fact(m))/(fact(m-n)*fact(n))>9){
            System.out.print((fact(m))/(fact(m-n)*fact(n)) + " ");
        }
        else
            System.out.print((fact(m))/(fact(m-n)*fact(n)) + "  ");
    }
    public static int fact(int number){  
        int factorial=1;
        for(int i=1;i<=number;i++){    
            factorial=factorial*i;    
        }    
        return factorial;  
       }  
}
