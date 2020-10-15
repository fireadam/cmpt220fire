import java.util.Scanner;

public class Problem3 {  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total seconds: ");
        long sec = input.nextLong();
        System.out.print("The hours, minutes, and seconds for total seconds " + sec +" is ");
        System.out.print(format(sec));
    }
    public static String format(long seconds){
        long hr = (seconds/3600);
        long min = (seconds % 3600)/60;
        long secs = (seconds % 3600)%60;
        String s = hr + ":" + min + ":" + secs;
        return s;
    }
}
