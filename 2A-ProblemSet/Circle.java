public class Circle {
    double radius;
    
    public Circle() {
        radius = 1;
    }
    
    public Circle(double r) {
        radius = r;
    }
    
    public String toString() {
      return"Hello, I am a circle with a radius of " + radius + ".";
   
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getCircumference() {
        return radius*2*Math.PI;
    }
    
    public double getArea() {
        return radius*radius*Math.PI;
    }
}