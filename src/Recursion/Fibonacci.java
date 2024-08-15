package Recursion;

import java.util.Scanner;

public class Fibonacci
{
    public static int fib(int n)
    {
        if(n==1 || n==2)
        {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);


        System.out.println(fib(20));
    }
}
