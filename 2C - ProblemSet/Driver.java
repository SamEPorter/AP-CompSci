
import java.util.Scanner;

class Driver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OrderedPair p1, p2, p3, p4, p5, p6;
        Formulas f = new Formulas();
        p1 = new OrderedPair();
        p2 = new OrderedPair(4, 2);
        
        
        System.out.println("If ordered pair is 0,0");
        System.out.println("Ordered Pair --->  "+p1.toString());
        System.out.println("X Value --->  "+p1.getX());
        System.out.println("Y Value --->  "+p1.getY());

        System.out.println("\nIf ordered pair is 4,2");
        System.out.println("Ordered Pair --->  "+p2.toString());
        System.out.println("X Value --->  "+p2.getX());
        System.out.println("Y Value --->  "+p2.getY());
        
        
        System.out.println("\nThe Possible X value of the equation" +
            "\nAx^2 + Bx + C = 0 are: " );
        System.out.print("select a value for A:  ");
            double Answer1 = input.nextDouble();
        System.out.print("select a value for B:  ");   
            double Answer2 = input.nextDouble();
        System.out.print("select a value for C:  ");    
            double Answer3 = input.nextDouble();
        System.out.println("Possible X values --->  "+ f.findQuadraticRoots(Answer1, Answer2, Answer3));
        
        System.out.println("\nSlope of Ordered pairs"); 
        System.out.print("select a value for x1:  ");
        double x1 = input.nextDouble();
        System.out.print("select a value for y1:  ");
        double y1 = input.nextDouble();
        System.out.print("select a value for x2:  ");
        double x2 = input.nextDouble();
        System.out.print("select a value for y2:  ");
        double y2 = input.nextDouble();
        
        p3 = new OrderedPair(x1, y1);
        p4 = new OrderedPair(x2, y2);
        System.out.println("Slope Value --->  "+f.findSlope(p3, p4));

        System.out.println("\nMidpoint of Ordered pairs"); 
        System.out.print("select a value for x1:  ");
        double x3 = input.nextDouble();
        System.out.print("select a value for y1:  ");
        double y3 = input.nextDouble();
        System.out.print("select a value for x2:  ");
        double x4 = input.nextDouble();
        System.out.print("select a value for y2:  ");
        double y4 = input.nextDouble();
        
        p5 = new OrderedPair(x3, y3);
        p6 = new OrderedPair(x4, y4);
        System.out.println("Middle Point --->  "+f.findMidpoint(p5, p6));

        System.out.println("\nSum of an Arithmetic Series"); 
        System.out.print("select a value for A:  ");
            double A1 = input.nextDouble();
        System.out.print("select a value for D:  ");   
            double D1 = input.nextDouble();
        System.out.print("select a value for K:  ");    
            int K1 = input.nextInt();
        System.out.println("Sum of an Arithmetic Series:  --->  "+
            f.findArithmeticSeriesSum(A1, D1, K1));

        System.out.println("\nSum of an Geometric Series:"); 
        System.out.print("select a value for A:  ");
            double A2 = input.nextDouble();
        System.out.print("select a value for R:  ");   
            double R1 = input.nextDouble();
        System.out.print("select a value for K:  ");    
            int K2 = input.nextInt();
        System.out.println("Sum of an Geometric Series:  --->  "+
            f.findGeometricSeriesSum(A2, R1, K2));

        System.out.println("\nRandom Dice roll"); 
        System.out.print("How many sides should the die have?  ");    
            int sides = input.nextInt();
        System.out.println("You rolled a:  --->  "+ f.rollDie(sides));
    }
}

