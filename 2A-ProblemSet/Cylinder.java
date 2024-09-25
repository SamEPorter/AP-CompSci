public class Cylinder {
    double height;
    Circle c3;
    
    public Cylinder() {
        height = 1;
        c3 = new Circle(1);
    }
    
    public Cylinder(double h, double b) {
        height = h;
        c3 = new Circle(b);
    }
    
    public String toString() {
        return "Hello, I am a cylinder with a radius of "+ c3.getRadius() + 
        " and height of " + height + ". ";
        
    }
    
    public double getRadius() {
        return c3.getRadius();
    }
    
    public double getHeight() {
        return height;
    }
    
    public double surfaceArea() {
      return c3.getArea()*2 + c3.getCircumference()*height;  
    }
    
    public double volume() {
      return c3.getRadius()*c3.getRadius()*Math.PI*height;
    }
}
