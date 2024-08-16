package Recursion;

import java.util.Scanner;

public class Practice {
    public static int multiplication(int m,int n)
    {
        if(m==0||n==0)
        {
            return 0;
        }
        return m + multiplication(m,n-1);
    }
    public static int  sumOfDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int remainder =n%10;
        n=n/10;
        return remainder + sumOfDigits(n);
    }
    public static int staircase(int n)
    {
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        return staircase(n-1) +staircase(n-2) +staircase(n-3);
    }


    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println("Enter two numbers for multiplication ?");
        int m=in.nextInt();
        int n=in.nextInt();
        System.out.println("Multiplication using Recursion : " +multiplication(m,n));

        System.out.println("------------------------------------------------------------");
        System.out.println("Enter a number whose sum of digits you want ?");
        int o = in.nextInt();
        System.out.println("Sum of digits of "+ o + " :" +sumOfDigits(o));
        
        System.out.println("------------------------------------------------------------");
        System.out.println("Enter no of stairs ?");
        int p =in.nextInt();
        System.out.println("Minimum no of steps required is : "+staircase(p));




    }
}
