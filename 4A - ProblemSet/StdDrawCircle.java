public class StdDrawCircle {
    public static void main(String[] args) {
        StdDraw.setScale(0, 500);
       double x = 500;
        while (x >= 0) {
            if (x%20 == 0) {
                StdDraw.setPenColor(StdDraw.BLACK);
            } else {
                StdDraw.setPenColor(StdDraw.WHITE);
            }
        StdDraw.filledCircle(250, 250, x);
        x-=10;
    }
    }
}