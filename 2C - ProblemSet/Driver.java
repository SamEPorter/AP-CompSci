
import java.util.Scanner;

class Driver {

    public static void main(String[] args) {
        OrderedPair p1, p2;
        Formulas f = new Formulas();
        p1 = new OrderedPair();
        p2 = new OrderedPair(2, 2);

        System.out.println("If ordered pair is 0,0");
        System.out.println("Ordered Pair --->  "+p1.toString());
        System.out.println("X Value --->  "+p1.getX());
        System.out.println("Y Value --->  "+p1.getY());

        System.out.println("\nIf ordered pair is 1,5");
        System.out.println("Ordered Pair --->  "+p2.toString());
        System.out.println("X Value --->  "+p2.getX());
        System.out.println("Y Value --->  "+p2.getY());

        System.out.println("\nThe Possible X value of the equation" +
            "\nx^2 + 2x + 1 are: " );
        System.out.println("Quadratics --->  "+ f.findQuadraticRoots(1, 2, 1));
        System.out.println("\nSlope of Ordered points (0, 0) and (2,2)"); 
        System.out.println("Slope Value --->  "+f.findSlope(p1, p2));

        System.out.println("\nMidpoint of Ordered points (0, 0) and (2,2)"); 
        System.out.println("Middle Point --->  "+f.findMidpoint(p1, p2));

        System.out.println("\nSum of an Arithmetic Series: 10, 11, 12"); 
        System.out.println("Sum of an Arithmetic Series:  --->  "+
            f.findArithmeticSeriesSum(10, 11, 12));
        
        System.out.println("\nSum of an Geometric Series: 10, 0.5, 12"); 
        System.out.println("Sum of an Geometric Series:  --->  "+
            f.findGeometricSeriesSum(10, 0.5, 12));
    }
}

