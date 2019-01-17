package edu.Chapter1_2;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by bicheng on 2018/7/18.
 */
public class Rational {

    private final long numerator;
    private final long denominator;

    public Rational(long numerator, long denominator)
    {
        if (denominator == 0)
            throw new RuntimeException("Denominator is zero");
        long g = gcd(numerator, denominator);
        if (denominator < 0)
            g = -g;

        this.numerator = numerator / g;
        this.denominator = denominator / g;
    }
    private static long gcd(long m, long n)
    {
        if (m < 0) m = -m;
        if (n < 0) n = -n;
        if (n == 0) return m;
        return gcd(n, m % n);
    }

    /**
     * 该数与有理数b之和
     * @param b
     * @return
     */
    public Rational plus(Rational b)
    {
        assert(denominator < Integer.MAX_VALUE && denominator > Integer.MIN_VALUE);
        assert(b.denominator < Integer.MAX_VALUE && b.denominator > Integer.MIN_VALUE);
        long d = denominator * b.denominator;
        long n = numerator * b.denominator + denominator * b.numerator;
        return new Rational(n, d);
    }

    /**
     * 该数与有理数b之差
     * @param b
     * @return
     */
    public Rational minus(Rational b)
    {
        long d = denominator * b.denominator;
        long n = numerator * b.denominator - denominator * b.numerator;
        return new Rational(n, d);
    }

    /**
     * 该数与有理数之积
     * @param b
     * @return
     */
    public Rational times(Rational b)
    {
        return new Rational(numerator * b.numerator, denominator * b.denominator);
    }

    /**
     * 该数与有理数之商
     * @param b
     * @return
     */
    public Rational divides(Rational b)
    {
        return new Rational(numerator * b.denominator, denominator * b.numerator);
    }

    public boolean equals(Rational that)
    {
        if (this == that) return true;
        if (that == null) return false;
        if (this.getClass() != that.getClass()) return false;
        return (numerator == that.numerator && denominator == that.denominator);
    }
    public String toString()
    {
        if (this.denominator == 1)
            return String.format("%d", this.numerator);
        return String.format("%d/%d", this.numerator, this.denominator);
    }

    public static void main(String[] args){
        Rational r1 = new Rational(5,12);
        Rational r2 = new Rational(3,8);

        StdOut.println(r1.plus(r2));
        StdOut.println(r1.minus(r2));
        StdOut.println(r1.times(r2));
        StdOut.println(r1.divides(r2));
    }


}
