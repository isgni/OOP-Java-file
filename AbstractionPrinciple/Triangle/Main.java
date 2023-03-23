class Triangle
{
  private
    double a;
    double b;
    double c;
    
    
    public
    
    Triangle(double aVal, double bVal, double cVal)  
    {
        a = aVal;
        b = bVal;
        c = cVal;
    }
    
  double calcArea()
    {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    return area;
    }
}

public class Main {

   public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Area = " + triangle.calcArea());
    }
}