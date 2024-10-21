
public class OrderedPair {
    double x, y;
    
        public OrderedPair() {
           x = 0;
           y = 0;
        }
        
        public OrderedPair(double x1, double y1) {
            x = x1;
            y = y1;
        }
        
        public String toString() {
            return "("+x+","+y+")";
        }
        
        public double getX() {
            return x;
        }
        
        public double getY() {
            return y;
        }
    
}