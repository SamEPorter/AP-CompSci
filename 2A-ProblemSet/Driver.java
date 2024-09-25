
public class Driver {
    
    public static void main(String[] args) {
        Circle c1, c2;
        Cylinder Cy1;
        
        c1 = new Circle();
        c2 = new Circle(5);
        Cy1 = new Cylinder(4, 2);
        
        System.out.println(c1.toString());
        System.out.println("getRadius ->>>  " + c1.getRadius());
        System.out.println("getCircumference ->>>  " + c1.getCircumference());
        System.out.println("getArea ->>>  " + c1.getArea()+"\n");
        
        System.out.println(c2.toString());
        System.out.println("getRadius ->>>  " + c2.getRadius());
        System.out.println("getCircumference ->>>  " + c2.getCircumference());
        System.out.println("getArea ->>>  " + c2.getArea()+"\n");
        
        System.out.println(Cy1.toString());
        System.out.println("getRadius ->>>  " + Cy1.getRadius());
        System.out.println("getHeight ->>>  " + Cy1.getHeight());
        System.out.println("surfaceArea ->>>  " + Cy1.surfaceArea());
        System.out.println("volume ->>>  " + Cy1.volume()+"\n");
    }
    
}