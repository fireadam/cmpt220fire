import java.util.ArrayList;

public class Problem1 {  
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your string and delimiters:  ");
        String mystring = input.nextLine();
        String myd = input.nextLine();
        split(mystring,myd);
    }
    public static ArrayList<String> split(String s, String delimiters){
        ArrayList<String> finalList = new ArrayList<>();
        ArrayList<String> mydString = new ArrayList<>();
        for (int i =0; i < delimiters.length() ;i++){
            mydString.add(Character.toString(delimiters.charAt(i)));
        }
        //add elements to finalList
        int begin = 0;
        for (int i = 0; i< s.length(); i++){
            if(mydString.contains(s.charAt(i))){
                finalList.add(s.substring(begin,i));
                begin=i+1;
            }
        }
        return finalList;

    }

}