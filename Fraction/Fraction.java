public class Fraction {
    private long numerator;
    private long denominator;
    private long gcd (long a, long b) {
        if (a < 0) a = -a;
        while (b != 0) {
        long remainder = a % b;
        a = b;
        b = remainder;
    }
        if (a == 0) {
            a = 1;
        }
            return a;
        
    }

    public Fraction(long num, long denom) {
        if ((num == 0) && (denom == 0)) {
            System.out.println("NaN");
        }
        else if ((num == 0) || (denom == 0)) {
            if ((num < 0) || (denom < 0)) {
                System.out.println("-Infinity");
            }
            else {
                System.out.println("Infinity");
            }
        }
        else { 
            long gcd = gcd(num, denom);
            numerator = num / gcd;
            denominator = denom / gcd;
            if (denominator < 0) {
                numerator = -numerator;
                denominator = -denominator;
            }

        }
        
    }
    public Fraction(long num) {
        numerator = num;
        denominator = 1;
    }
    public long getNumerator() {
        return numerator;
    }
    public long getDenominator() {
        return denominator;
    }
    public String toString() {
        if (denominator == 1) {
            return Long.toString(numerator);
        }
        return numerator + "/" + denominator;
    }
    public static void main (String[] args) {
        Fraction f1 = new Fraction (6, -24);
        System.out.println(f1);
        Fraction f2 = new Fraction (0, 8);
        Fraction f3 = new Fraction (8, -6);
        System.out.println(f3);
        Fraction f4 = new Fraction (23, 0);
        Fraction f5 = new Fraction (-6, 0);
        Fraction f6 = new Fraction (7, 1);
        System.out.println(f6);
        Fraction f7 = new Fraction (0, 0);

    }
}
