public class Problem3 {
    public static void main(String[] args){
        double x = (double)(Math.random()*5);
        double y = (double)(Math.random()*5);
        double r = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        while (r >= 5){
            x = (double)(Math.random()*5);
            y = (double)(Math.random()*5);
            r = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        }
        System.out.print("The point is (" + x + ", " + y + ") and its distance to the center is " + r);
    }
}
