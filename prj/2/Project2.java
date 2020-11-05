public class Project2 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter an interest rate and an investment amount: ");
        //rate and investment inputs
        // It is not vlear what the format of the rate should be, e.g. 9%, 9, .09, etc
        double rate = input.nextDouble();
        double investment = input.nextDouble();
        //Year array
        int[] t = new int[30];
        //Future Value array
        double[] calc = new double[30];
        System.out.println("Years  Future Value ");
        //Loop for the display of the arrays side by side
        for (int i = 0; i<30; i++){
            t[i] = (i+1);
            calc[i] = futureInvestmentValue(investment, rate/12, i+1);
            // You should format the output to only 2 digits after the decimal point
            System.out.println(t[i] + "   " + calc[i]); 
        }
    }
    //Method for our equation
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate,int years){
        double result = investmentAmount*Math.pow(1+monthlyInterestRate,years*12);
        return result;
    }

}