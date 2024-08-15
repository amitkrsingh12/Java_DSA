package Recursion;

import java.util.Scanner;

public class Factorial {

    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String argsp[])
    {
        Scanner in =  new Scanner(System.in);
        int n;
        System.out.println("Enter the number whose factorial you want ?");
        n=in.nextInt();
        System.out.println(fact(n));

    }
}
