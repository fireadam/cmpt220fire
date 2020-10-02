import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a genome string: ");
        String gen = input.nextLine();
        int x = gen.indexOf("ATG");
        if (x ==-1 || gen.length() % 3 != 0 || gen.length() < 8){
            System.out.print("No gene is found");
        }
            else{
            int i=0;
            while (i < gen.length()){
                int a = gen.indexOf("ATG", i);
                int b = gen.indexOf("TAG", i);
                int c = gen.indexOf("TAA", i);
                int d = gen.indexOf("TGA", i);
                if (a != -1){
                    if (b == -1){
                        b = 100000;
                    }
                    if (c == -1){
                        c = 100000;
                    }
                    if (d == -1){
                        d = 100000;
                    }
                    String gen2 = gen.substring(a+3,Math.min(b,Math.min(c,d)));
                    System.out.println(gen2);
                    i = a + 1;
                    if (gen.indexOf("ATG", i) != -1){
                        i = gen.indexOf("ATG", i);
                    }
                        else{
                        break;
                    }
                }
                    else{
                    break;
                }
            }
        }
    }
    //if ((gen.indexOf("TAG") != -1 || gen.indexOf("TAA")!= -1 || gen.indexOf("TGA")!= -1) && gen.indexOf("ATG") != 0){
      //  int a = gen.indexOf("TAG");
      //  int b = gen.indexOf("TAA");
     //   int c = gen.indexOf("TGA");
     //   String newgen = gen.substring(x+3,Math.min(a,Math.min(b,c)));
     //   System.out.print(newgen);
     //   gen = gen.substring(gen.length()-newgen.length(),gen.length());
     //   x = gen.indexOf("ATG");
    //}

}
