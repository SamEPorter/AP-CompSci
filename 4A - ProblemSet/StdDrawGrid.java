public class StdDrawGrid {
	public static void main (String[] args) {
    	StdDraw.setScale(0, 500);
    	int x = 0;
    	int y = 0;
   	while(x<=500) {
   	    StdDraw.line(x, 0, x, 500);
   	    StdDraw.line(0, y, 500, y);
   	    y+=10;
   	    x+=10;
    }
}
}
