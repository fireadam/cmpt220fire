public class Problem2 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();
        //Exception handling
        try{
            bin2Dec(binary);
        }
        catch(NumberFormatException e){
            System.out.print("Not a binary number");
        }
    }
    //binary to decimal method
    public static int bin2Dec(String binaryString){
        int number = Integer.parseInt(binaryString);
        int dec = 0;
        int i = 0;
        while(true){
            if(number == 0){
                break;
            } 
            else {
                int t = number%10;
                dec += t*Math.pow(2, i);
                number = number/10;
                i++;
            }
        }
        System.out.print(dec);
        return dec;
    }
}
