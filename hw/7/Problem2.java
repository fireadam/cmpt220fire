public class Problem2 {  
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        Point2 p1 = new Point2();
        p1.setX(input.nextDouble());
        p1.setY(input.nextDouble());
        Point2 p2 = new Point2();
        p2.setX(input.nextDouble());
        p2.setY(input.nextDouble());
        Point2 p3 = new Point2();
        p3.setX(input.nextDouble());
        p3.setY(input.nextDouble());
        getCenterPoint(p1,p2,p3);
    }
    public static Point2 getCenterPoint(Point2 p1, Point2 p2, Point2 p3){
        Point2 answ = new Point2();
        answ.setX((p1.getX()+p2.getX()+p3.getX())/3.0);
        answ.setY((p1.getY()+p2.getY()+p3.getY())/3.0);
        System.out.print("The center point is at (" + answ.getX() + ", " + answ.getY() + ")");
        return answ;
    }
}
class Point2{
    private double x;
    private double y;
    Point2(){

    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
}