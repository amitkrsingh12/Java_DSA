package AnitaSethBook.Methods;

class Farm
{
    private double length;
    private double width;
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    private double area(){
        return length*width;
    }
    Farm(double l, double w)
    {
        length=l;
        width=w;
    }
    public double getArea(){
        return length*width;
    }
}
public class AccessingPrivateMethods
{
    public static void main(String args[])
    {
        Farm f1 = new Farm(40,20);
        Farm f2 = new Farm(24,15);
        System.out.println("Area of f1 : "+f1.getArea());
        System.out.println("Length of f1  : "+f1.getLength());
        System.out.println("Length of f2  : "+f1.getWidth());
        System.out.println("Area of f2 :"+f2.getArea());
    }
}
