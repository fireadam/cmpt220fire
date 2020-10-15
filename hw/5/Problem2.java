import java.util.Scanner;

public class Problem2 {  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String n = input.nextLine();
        title(n);
    }
    public static void title(String s){
        System.out.print("The new string is: ");
        System.out.print(s.substring(0,1).toUpperCase() + s.substring(1,s.indexOf(" ")+1));
        int i = 0;
        while (s.indexOf(" ",i) != -1){
            if (s.indexOf(" ",s.indexOf(" ",i)+1) != -1) 
                System.out.print(s.substring(s.indexOf(" ",i)+1,s.indexOf(" ",i)+2).toUpperCase() + s.substring(s.indexOf(" ",i)+2,s.indexOf(" ",s.indexOf(" ",i)+1)+1));
            else
                System.out.print(s.substring(s.indexOf(" ",i)+1,s.indexOf(" ",i)+2).toUpperCase() + s.substring(s.indexOf(" ",i)+2,s.length()));
            i = s.indexOf(" ",i)+1;
        }
    }
}
