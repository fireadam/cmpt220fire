public class Complex extends Number implements Comparable<Complex>, Cloneable{
    //a is real part
    //b is imaginary part
    private double a=0;
    private double b=0;
    //Constructors
    Complex(){
    }
    Complex(double a){
        this.a=a;
    }
    Complex(double a,double b){
        this.a=a;
        this.b=b;
    }
   
    // All computations
    public Complex add(Complex complex2) {
        double a1 = a + complex2.getRealPart();
        double b1 = b + complex2.getImaginaryPart();
        return new Complex(a1, b1);
    }
    public Complex subtract(Complex complex2) {
        double a1 = a - complex2.getRealPart();
        double b1 = b - complex2.getImaginaryPart();
        return new Complex(a1, b1);
    }
    public Complex multiply(Complex complex2) {
        double a1 = (a*complex2.getRealPart())-(b*complex2.getImaginaryPart());
        double b1 = (b*complex2.getRealPart())+(a*complex2.getImaginaryPart());
        return new Complex(a1, b1);
    }
    public Complex divide(Complex complex2) {
        double c = complex2.getRealPart();
        double d = complex2.getImaginaryPart();
        double a1 = (a*c + b*d)/(1.0*(Math.pow(c, 2) + Math.pow(d, 2)));
        double b1 = (b*c - a*d)/(1.0*(Math.pow(c, 2) + Math.pow(d, 2)));
        return new Complex(a1, b1);
    }
    public double abs() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    //getters
    double getRealPart(){
        return a;
    }
    double getImaginaryPart(){
        return b;
    }
    // Override toString()
    @Override
    public String toString() {
        if (a == 0 && b == 0)
            return "0";
        else if (a != 0 && b == 0)
            return "" + a + "";
        else
            return a + " + " + b + "i";
    }
    // Override clone()
    @Override
    public Object clone(){
        try{
            return super.clone();
        }
        catch(CloneNotSupportedException ex){
            return null;
        }
    }
    // Implement the compareTo method
    @Override
    public int compareTo(Complex a2) {
        if (a<a2.a)
            return 1;
        else if (a2.a<a)
            return -1;
        else
            return 0;
    }

    // Mandatory methods from Number class
    @Override // Implement the abstract intValue method in Number 
    public int intValue() {
      return (int)doubleValue();
    }
  
    @Override // Implement the abstract floatValue method in Number 
    public float floatValue() {
      return (float)doubleValue();
    }
  
    @Override // Implement the doubleValue method in Number 
    public double doubleValue() {
      return doubleValue();
    }
  
    @Override // Implement the abstract longValue method in Number
    public long longValue() {
      return (long)doubleValue();
    }
}
