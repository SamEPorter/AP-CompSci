
public class Fraction {
    
    private int numerator;
    private int denominator;
    
            /**------------------------- Constructors -------------------------**/
    // Default Constructor
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }
    
    // Parameterized Constructor
    public Fraction(int num, int den) {
        numerator = num;
        setDenom(den);
    }
    
    // String Paramaterized Constructor
    public Fraction(String frac) {
        numerator = Integer.parseInt(frac.substring(0, frac.indexOf("/")));
        if (Integer.parseInt(frac.substring(frac.indexOf("/")+1)) == 0) {
            System.out.println("Error: Denominator cannot be zero");
            denominator = 1;
        } else {
            denominator = Integer.parseInt(frac.substring(frac.indexOf("/")+1)); 
        }       
    }
    
    // Copy Constructor
    public Fraction(Fraction f) {
        numerator = f.numerator;
        denominator = f.denominator;
    }
    
    
            /**------------------------- Accessor Methods -------------------------**/
    // Get Numerator           
    public int GetNum() {
        return numerator;
    }
    
    // Get Denominator
    public int GetDenom() {
        return denominator;
    }
    
    // Convert to String
    public String toString() {
        return numerator+"/"+denominator;
    }
    
    // To Double
    public double toDouble() {
        return (double) numerator / denominator;
    }
    
    
            /**------------------------- Mutator Methods -------------------------**/
    // Reduce to lowest terms
    public void reduce() {
        int factor = GCF(numerator, denominator);
        
        numerator /= factor;
        denominator /= factor;
        //denominator /= factor;
        
    }
    
    public int GCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return Math.abs(a);
    }
    
        
        
    // Set Numerator
    public void setNum(int n) {
        numerator = n;
    }
    
    // Set Denominator
    public void setDenom(int den) {
        if (den == 0) {
            System.out.println("Error: Denominator cannot be zero");
            denominator = 1;
        } else {
            denominator = den; 
        }        
    }
    
            /**------------------------- Static Methods -------------------------**/
    // Multiply 
    public static Fraction multiply(Fraction a, Fraction b) {
        int Numer = a.numerator*b.numerator;
        int Denom = a.denominator*b.denominator;
        
        return new Fraction(Numer, Denom);
    }
    
    // Divide
    public static Fraction divide(Fraction a, Fraction b) {
        int Numer = a.numerator*b.denominator;
        int Denom = a.denominator*b.numerator;
        
        return new Fraction(Numer, Denom);
    }
    
    // Add
    public static Fraction add(Fraction a, Fraction b) {
        int denom1 = a.denominator;
        int denom2 = b.denominator;
        
        a.numerator*= denom2;
        a.denominator*= denom2;
        b.numerator*= denom1;
        b.denominator*= denom1;
        
        int cNUM = a.numerator + b.numerator;
        int cDEN = a.denominator;

        return new Fraction(cNUM, cDEN);
    }
    
    // Subtract
    public static Fraction subtract(Fraction a, Fraction b) {
        int denom1 = a.denominator;
        int denom2 = b.denominator;
        
        a.numerator*= denom2;
        a.denominator*= denom2;
        b.numerator*= denom1;
        b.denominator*= denom1;
        
        int cNUM = a.numerator - b.numerator;
        int cDEN = a.denominator;
        
        return new Fraction(cNUM, cDEN);
    }
    
    // RANDOM FRACTION
    public void randomize() {
        numerator = (int) (Math.random() * 9) + 1;
        denominator = (int) (Math.random() * 9) + 1;
    }
}