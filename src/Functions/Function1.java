package Functions;

import java.util.Scanner;

public class Function1
{
    public static int factorial(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact =fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int r=in.nextInt();
        in.close();

        int FactN = factorial(n);
        int factR = factorial(r);
        int factNR =factorial(n - r);
        int result  = FactN /(factR * factNR);
        System.out.println(result);
    }
}
