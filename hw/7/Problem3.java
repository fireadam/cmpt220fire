public class Problem3 {  
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        Point3 p1 = new Point3();
        p1.setX(input.nextDouble());
        p1.setY(input.nextDouble());
        Point3 p2 = new Point3();
        p2.setX(input.nextDouble());
        p2.setY(input.nextDouble());
        Point3 p3 = new Point3();
        p3.setX(input.nextDouble());
        p3.setY(input.nextDouble());
        getTriangleArea(p1,p2,p3);
    }
    public static Double getTriangleArea(Point3 p1, Point3 p2, Point3 p3){
        double answ;
        answ = (p1.getX()*(p2.getY()-p3.getY())+p2.getX()*(p3.getY()-p1.getY())+p3.getX()*(p1.getY()-p2.getY()))/2.0;
        if (answ != 0){
            System.out.print("The area of the triangle is " + answ);
            return answ;
        }
        else{
            System.out.print("The three points are on the same line");
            return null;
        }
    }
}
class Point3{
    private double x;
    private double y;
    Point3(){

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