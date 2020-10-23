public class Problem2 {  
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String mystring = input.nextLine();
        count(mystring);
    }
    public static int[] count(String s){
        String[] arrayinit = s.split("");
        int sum0 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        int sum7 = 0;
        int sum8 = 0;
        int sum9 = 0;
        for (int i = 0; i < arrayinit.length; i++){
            if (arrayinit[i].equals("0"))
                sum0 += 1;
            else if (arrayinit[i].equals("1"))
                sum1 += 1;
            else if (arrayinit[i].equals("2"))
                sum2 += 1;
            else if (arrayinit[i].equals("3"))
                sum3 += 1;
            else if (arrayinit[i].equals("4"))
                sum4 += 1;
            else if (arrayinit[i].equals("5"))
                sum5 += 1;
            else if (arrayinit[i].equals("6"))
                sum6 += 1;
            else if (arrayinit[i].equals("7"))
                sum7 += 1;
            else if (arrayinit[i].equals("8"))
                sum8 += 1;
            else if (arrayinit[i].equals("9"))
                sum9 += 1;
        }
        int[] counts = {sum0,sum1,sum2,sum3,sum4,sum5,sum6,sum7,sum8,sum9};
        if (sum0 > 1)
            System.out.println("Digit 0 occurs " + counts[0] + " times");
        else if (sum0 == 1)
            System.out.println("Digit 0 occurs 1 time");

        if (sum1 > 1)
            System.out.println("Digit 1 occurs " + counts[1] + " times");
        else if (sum1 == 1)
            System.out.println("Digit 1 occurs 1 time");      

        if (sum2 > 1)
            System.out.println("Digit 2 occurs " + counts[2] + " times");
        else if (sum2 == 1)
            System.out.println("Digit 2 occurs 1 time");

        if (sum3 > 1)
            System.out.println("Digit 3 occurs " + counts[3] + " times");
        else if (sum3 == 1)
            System.out.println("Digit 3 occurs 1 time");

        if (sum4 > 1)
            System.out.println("Digit 4 occurs " + counts[4] + " times");
        else if (sum4 == 1)
            System.out.println("Digit 4 occurs 1 time");

        if (sum5 > 1)
            System.out.println("Digit 5 occurs " + counts[5] + " times");
        else if (sum5 == 1)
            System.out.println("Digit 5 occurs 1 time");

        if (sum6 > 1)
            System.out.println("Digit 6 occurs " + counts[6] + " times");
        else if (sum6 == 1)
            System.out.println("Digit 6 occurs 1 time");

        if (sum7 > 1)
            System.out.println("Digit 7 occurs " + counts[7] + " times");
        else if (sum7 == 1)
            System.out.println("Digit 7 occurs 1 time");

        if (sum8 > 1)
            System.out.println("Digit 8 occurs " + counts[8] + " times");
        else if (sum8 == 1)
            System.out.println("Digit 8 occurs 1 time");

        if (sum9 > 1)
            System.out.println("Digit 9 occurs " + counts[9] + "times");
        else if (sum9 == 1)
            System.out.println("Digit 9 occurs 1 time");

        return counts;
    }
}