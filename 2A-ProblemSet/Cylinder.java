
public class Cylinder {
    double height;
    circleC = new Circle(
    public Cylinder() {
        radius = 1;
    }
    
    public Cylinder(double r) {
        radius = r;
    }
    
    public String toString() {
      return"Hello, I am a Cylinder with a radius of " + radius + ".";
   
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