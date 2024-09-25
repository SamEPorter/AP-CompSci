
public class Driver {
    
    public static void main(String[] args) {
        Circle c1, c2;
        
        c1 = new Circle();
        c2 = new Circle(5);
        
        System.out.println(c1.toString());
        System.out.println("getRadius ->>>  " + c1.getRadius());
        System.out.println("getCircumference ->>>  " + c1.getCircumference());
        System.out.println("getArea ->>>  " + c1.getArea()+"\n");
        
        System.out.println(c2.toString());
        System.out.println("getRadius ->>>  " + c2.getRadius());
        System.out.println("getCircumference ->>>  " + c2.getCircumference());
        System.out.println("getArea ->>>  " + c2.getArea()+"\n");
    }
    
}