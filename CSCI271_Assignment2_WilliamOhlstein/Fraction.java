public class Fraction{
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


// GCD Function gives us our greatest common divisor 



// Fraction function takes a numerator and denominator and checks to see if both are 0 if so return NaN, if one is zero check to see if negative or not
// If it's neither then actually calculate our fraction by calling the GCD function and then dividing our num and denom by the GCD. 
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

// Converts our fractions to strings to print out, if the denom = 1 then just return the numerator because 7/1 = 7 5/1 = 5 etc...
// if not = 1 then return the num / denom
    public String toString() {
        if (denominator == 1) {
            return Long.toString(numerator);
        }
        return numerator + "/" + denominator;
    }

// For our add and subtract methods we cross multiply to get our answers. 
// But for add we + and subtract we -
    public Fraction add(Fraction other) {
        long num = this.numerator * other.denominator + other.numerator * this.denominator;
        long denom = this.denominator * other.denominator;
        return new Fraction(num, denom);
    }
    public Fraction subtract(Fraction other) {
        long num = this.numerator * other.denominator - other.numerator * this.denominator;
        long denom = this.denominator * other.denominator;
        return new Fraction(num, denom);
    }

// For our multiply method  we multiply straight across
    public Fraction multiply(Fraction other) {
        long num = this.numerator * other.numerator;
        long denom = this.denominator * other.denominator;
        return new Fraction(num, denom);
    }

// For divide we multiply the inverse
    public Fraction divide(Fraction other) {
        long num = this.numerator * other.denominator;
        long denom = this.denominator * other.numerator;
        return new Fraction(num, denom);
    }

    public Fraction negate() {
        return new Fraction(-this.numerator, this.denominator);
    }
    public Fraction pow(int exponent) {
        long num = (long) Math.pow(this.numerator, exponent);
        long denom = (long) Math.pow(this.denominator, exponent);
        return new Fraction(num, denom);
    }

// Hard coded examples that we were given. 
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

        Fraction f8 = new Fraction(16);
        Fraction f9 = new Fraction(3, 5).add(new Fraction(7));
        Fraction f10 = new Fraction(6,7);
        Fraction results = f10.multiply(f8.divide(f9));
        System.out.println(results);
    }
}

