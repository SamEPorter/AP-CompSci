public class StdDraw2 {
	public static void main (String[] args) {
    	StdDraw.setScale(0, 500);
    	int x = 500;
    	
    	int x2 = 0;
    	
   	while(x>=0) {
   	    StdDraw.line(x2, 0, 0, x);
   	    StdDraw.line(500, x2, x, 500); 
   	    
   	    x2+=5;
   	    x-=5;
    }
}
}