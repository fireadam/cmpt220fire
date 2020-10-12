/**
 * Always add comments to your code.
 */
import java.util.*;

public class Project1 {  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String[] nums = input.nextLine().split(" ");
        System.out.println("Output: ");
        int[] inum = convert(nums);
        int m = max(inum);
        for (int i = m; i>-1; i--){
            System.out.printf("%2d| ", i);
            for(int j = 0; j<inum.length; j++){
                if (inum[j]>=i){
                    System.out.printf("x ");
                }
                else{
                    System.out.printf("  ");
                }
            }
            System.out.printf(" %n");
        }
        System.out.printf("%s%n", new String(new char[inum.length*4]).replace("\0","-"));
        System.out.printf("  ");
        for (int i = 0; i<inum.length; i++){
            if (inum[i]>9){
                System.out.printf(" %2d", inum[i]);
            }
            else{
                System.out.printf("%2d", inum[i]);
            }
        }
    }
    public static int[] convert(String[] seq){
        int[] list = new int[seq.length];
        for(int i = 0; i<seq.length; i++){
            list[i] = Integer.parseInt(seq[i]);
        }
        return list;
    }
    public static int max(int[] numbers){
        int m = numbers[0];
        for (int i = 1; i<numbers.length; i++){
            if(numbers[i]>m){
                m = numbers[i];
            }
        }
        return m;
    }
}