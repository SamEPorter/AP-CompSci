//java.import.util Scanner s;
public class Driver {
    public static void main (String[] args) {
        Fraction whole = new Fraction();
        Fraction half = new Fraction(1, 2);
        Fraction third = new Fraction("1/3");
        Fraction AnotherHalf = new Fraction(half);
        Fraction testNum = new Fraction(252, 105);

        
        
        System.out.println(whole);
        System.out.println(half);
        System.out.println(third);
        System.out.println(AnotherHalf);

        System.out.println(AnotherHalf.GetNum());
        System.out.println(AnotherHalf.GetDenom());
        System.out.println(AnotherHalf.toString());
        System.out.println(AnotherHalf.toDouble());

        testNum.reduce();
        System.out.println(testNum);

        System.out.println(" ");

        Fraction multi = Fraction.multiply(half, third);
        multi.reduce();
        System.out.println(multi);

        Fraction divi = Fraction.divide(half, third);
        divi.reduce();
        System.out.println(divi);

        //System.out.println(multiply.add(half, third));
        Fraction sum = Fraction.add(half, third);
        sum.reduce();
        System.out.println(sum);

        Fraction sub = Fraction.subtract(half, third);
        sub.reduce();
        System.out.println(sub);

        System.out.println(testNum.GCF(252, 105));
         
        
        
    }       
}
