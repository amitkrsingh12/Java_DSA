package OOP;

public class FractionUse
{
    public static void main (String args[])
    {
        Fraction f1 = new Fraction(4,6);
        f1.print();
//        f1.simplify();
//        f1.increment();
        Fraction f2 = new Fraction(4,8);
        f2.print();
        f1.add(f2);
        f1.print();



    }
}
