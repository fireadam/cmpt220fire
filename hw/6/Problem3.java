public class Problem3 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the first string: ");
        String a1= input.nextLine();
        System.out.print("Enter the second string: ");
        String a2= input.nextLine();
        isAnagram(a1,a2);
    }
    public static boolean isAnagram(String s1, String s2){
        int sum = 0;
        int sum2 = 0;
        if (s1.length() == s2.length()){
            for (int i = 0; i < s1.length(); i++){
                char ch = s1.charAt(i);
                int charval = (int)ch;
                char ch2 = s2.charAt(i);
                int charval2 = (int)ch2;
                sum += charval;
                sum2 += charval2;
                if (i==s1.length()-1){
                    if (sum == sum2)
                        System.out.print(s1 + " and " + s2 + " are an anagram ");
                    else
                        System.out.print(s1 + " and " + s2 + " are not an anagram ");
                }
            }
        }
        else 
            System.out.print(s1 + " and " + s2 + " are not an anagram ");
        return true;
    }
}
