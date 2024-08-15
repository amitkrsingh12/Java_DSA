package OOP.StaticFunction;

public class Practice
{
    static  int a=40;
    int b=20;
    void Display(){
        System.out.println(a);
        System.out.println(b);
    }
    static void staticDisplay(){
        System.out.println(a);
    }
    public static void main(String args[])
    {
        Practice e1 = new Practice();
        e1.Display();
        staticDisplay();

    }
}
