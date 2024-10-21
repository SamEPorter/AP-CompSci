public class StdChaosGame {
    public static void main(String[] args) {
        StdDraw.setScale(0, 1);
        OrderedPair p1, p2, p3;
           int i = 0;
           int r = 0;
           double x = 0;
           double y = 1;
        StdDraw.setPenRadius(.0001);
        p1 = new OrderedPair(0, 1);
        p2 = new OrderedPair(0.5, 0);
        p3 = new OrderedPair(1, 1);
        StdDraw.point(p1.getX(), p1.getY());
        StdDraw.point(p2.getX(), p2.getY());
        StdDraw.point(p3.getX(), p3.getY());
        while (i <= 100000) {
            r = (int) (Math.random()*3)+1;
            
            if (r == 1) {
                x = (x+p1.getX())/2;
                y = (y+p1.getY())/2;
            } else if (r == 2) {
                x = (x+p2.getX())/2;
                y = (y+p2.getY())/2;
            } else {
                x = (x+p3.getX())/2;
                y = (y+p3.getY())/2;
            }
            StdDraw.point(x, y);
            i++;
        }
     
       // while () {
       //     
       // }
        
    }    
}