public class StdChaosGame {
    public static void main(String[] args) {
        StdDraw.setScale(0, 1);
        OrderedPair p1, p2, p3;
           int x = 0;
           int r = 0;
        StdDraw.setPenRadius(.01);
        p1 = new OrderedPair(0, 1);
        p2 = new OrderedPair(0.5, 0);
        p3 = new OrderedPair(1, 1);
        StdDraw.point(p1.getX(), p1.getY());
        StdDraw.point(p2.getX(), p2.getY());
        StdDraw.point(p3.getX(), p3.getY());
        while (x <= 500) {
            r = (int) (Math.random()*3)+1;
            if (r == 1) {
                StdDraw.point((p1.getX()+p1.getX())/2, (p1.getY()+p1.getY())/2);
            } else if (r == 2) {
                StdDraw.point((p1.getX()+p2.getX())/2, (p1.getY()+p2.getY())/2);
            } else {
                StdDraw.point((p1.getX()+p3.getX())/2, (p1.getY()+p3.getY())/2);
            }
            x++;
        }
     
       // while () {
       //     
       // }
        
    }    
}