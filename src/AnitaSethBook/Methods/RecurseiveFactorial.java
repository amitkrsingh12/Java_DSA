package AnitaSethBook.Methods;
import java.util.Scanner;

class Fact
{
    int factorial(int n)
    {
        int f=1;
        if(n==1)
        {
            return n;
        }
        f=n*factorial(n-1);
        return f;
    }
}
public class RecurseiveFactorial
{
    public static void main(String args[])
    {
        Fact obj = new Fact();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number whose factoiral you want ?");
        int n=in.nextInt();
        System.out.println(obj.factorial(n));
    }
}

