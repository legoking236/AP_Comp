
/**
 * Write a description of class Rational here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rational
{
    private int numerator;
    private int denomentator;
    
    Rational(int num, int den)
    {
        numerator = num;
        denomentator = den;
    }
    public void add(Rational f2)
    {
        int num1, num2, den1, den2, denres, numres;

        num2 = f2.getNumerator();
        den2 = f2.getDenomenator();
        if(denomentator != den2) {
            denres = getlcf(denomentator, den2);
        } else {
            denres = den2;
        }
        
        numres = numerator + num2;
        System.out.println("Result: " + numres + "/" + denres);
    }
    public void sub(Rational f2)
    {
        int num1, num2, den1, den2, denres, numres;

        num2 = f2.getNumerator();
        den2 = f2.getDenomenator();
        if(denomentator != den2) {
            denres = getlcf(denomentator, den2);
        } else {
            denres = den2;
        }
        
        numres = numerator - num2;
        System.out.println("Result: " + numres + "/" + denres);
    }
    public void mul(Rational f2)
    {
        int num1, num2, den1, den2, numres, denres;

        num2 = f2.getNumerator();
        den2 = f2.getDenomenator();
        
        numres = numerator * num2;
        denres = denomentator * den2;
        System.out.println("Result: " + numres + "/" + denres);
    }
    public void div(Rational f2)
    {
        int num1, num2, den1, den2, numres, denres;

        num2 = f2.getNumerator();
        den2 = f2.getDenomenator();
        
        numres = numerator * den2;
        denres = denomentator * num2;
        System.out.println("Result: " + numres + "/" + denres);
    }
    private int getlcf(int denom1, int denom2)
    {
        int lcf;
        lcf = denom1 * denom2;
        return lcf;
    }
    public int getNumerator()
    {
        return numerator;
    }
    public int getDenomenator()
    {
        return denomentator;
    }
}
