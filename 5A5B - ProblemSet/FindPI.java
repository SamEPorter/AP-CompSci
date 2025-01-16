
/**
 * Write a description of class FindPI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FindPI {
    public static void main (String[] args) {
        Fraction MILU = new Fraction(355, 113);
        final double EPSILON = Math.abs(Math.PI - MILU.toDouble() );
        Fraction pi = new Fraction(22, 7);
        double diff = Math.abs(pi.toDouble()-Math.PI);
        // WHILE the difference between My fraction and PI is greater than epsilon
        while (diff >= EPSILON) {
            // if MY value is greater than Pi, increase the denominator by 1
            if (pi.toDouble() > Math.PI) {
                pi.setDenom(pi.GetDenom() + 1);

                // if MY value is LESS than Pi, increase the numerator by 1
            } else {
                pi.setNum(pi.GetNum() + 1);
            }
            System.out.println(pi.toString());
            diff = Math.abs(pi.toDouble()-Math.PI);
        }
    }
}
