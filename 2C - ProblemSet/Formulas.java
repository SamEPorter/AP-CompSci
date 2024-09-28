public class Formulas  {

    public OrderedPair findQuadraticRoots (double a1, double b1, double c1) {
        double xplus = (b1*-1+Math.sqrt(Math.pow(b1,2)-(4*c1*a1)))/(a1*2);
        double xminus = (b1*-1-Math.sqrt(Math.pow(b1,2)-(4*c1*a1)))/(a1*2);
        OrderedPair quadP = new OrderedPair(xplus, xminus);
        return quadP;
    }
    
    public double findSlope (OrderedPair p1, OrderedPair p2) {
        double xs = (p2.x-p1.x)/2;
        double ys = (p2.y-p1.y)/2;
        return (ys/xs);
    }
    
    public OrderedPair findMidpoint(OrderedPair p1, OrderedPair p2) {
        double x = (p1.x + p2.x)/2; 
        double y = (p1.y + p2.y)/2;
        return new OrderedPair(x, y);
    }
    
    public double findArithmeticSeriesSum (double a, double d, int k) {
        double sum = (k/2)*(2*a+d*(k-1));
        return sum;
    }
    
    public double findGeometricSeriesSum (double a, double r, int k) {
        double sum = a*((1-Math.pow(r,k))/(1-r));
        return sum;
    }
    
    public int rollDie (int sides) {
        return (int) (Math.random()*sides)+1;
    }
}