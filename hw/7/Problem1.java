public class Problem1 {  
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        Point p1 = new Point();
        p1.setX(input.nextDouble());
        p1.setY(input.nextDouble());
        Point p2 = new Point();
        p2.setX(input.nextDouble());
        p2.setY(input.nextDouble());
        Point p3 = new Point();
        p3.setX(input.nextDouble());
        p3.setY(input.nextDouble());
        Point p4 = new Point();
        p4.setX(input.nextDouble());
        p4.setY(input.nextDouble());
        getIntersectingPoint(p1,p2,p3,p4);
    }
    public static Point getIntersectingPoint(Point p1, Point p2, Point p3, Point p4){
        double a = p1.getY()-p2.getY();
        double b = p1.getX()-p2.getX();
        double c = p3.getY()-p4.getY();
        double d = p3.getX()-p4.getX();
        double e = p1.getX()*(p1.getY()-p2.getY())-p1.getY()*(p1.getX()-p2.getX());
        double f = p3.getX()*(p3.getY()-p4.getY())-p3.getY()*(p3.getX()-p4.getX());
        if (a*d-b*c != 0){
            Point answ = new Point();
            answ.setX((e*d-b*f)/(a*1.0*d-b*c));
            answ.setY(-1*(a*f-e*c)/(a*1.0*d-b*c));
            System.out.print("The intersecting point is at (" + answ.getX() + ", " + answ.getY() + ")");
            return answ;
        }
        else{
            System.out.print("The two lines are parallel");
            return null;
        }
    }
}
class Point{
    private double x;
    private double y;
    Point(){

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