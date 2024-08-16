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
            return 1;
        }
        if(n==0)
        {
            return 1;
        }
        return staircase(n-1) +staircase(n-2) +staircase(n-3);
    }
    public static double  gemoetricSum(int input)
    {
        /*
        Given k, find the geometric sum i.e.
        1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
         */
        if(input==0)
        {
            return 1;
        }
        return 1/Math.pow(2,input) + gemoetricSum(input-1);
    }
    public static boolean isPalindrome(String str)
    {
        if(str.length()==0||str.length()==1)
        {
            return true;
        }
        if(str.charAt(0)!=str.charAt(str.length()-1))
        {
            return false;
        }
        return isPalindrome(str.substring(1,str.length()-1));
    }


    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
//        System.out.println("------------------------------------------------------------");
//        System.out.println("Enter two numbers for multiplication ?");
//        int m=in.nextInt();
//        int n=in.nextInt();
//        System.out.println("Multiplication using Recursion : " +multiplication(m,n));
//
//        System.out.println("------------------------------------------------------------");
//        System.out.println("Enter a number whose sum of digits you want ?");
//        int o = in.nextInt();
//        System.out.println("Sum of digits of "+ o + " :" +sumOfDigits(o));
//
//        System.out.println("------------------------------------------------------------");
//        System.out.println("Enter no of stairs ?");
//        int p =in.nextInt();
//        System.out.println("Minimum no of steps required is : "+staircase(p));

//        System.out.println("------------------------------------------------------------");
//        System.out.println("enter a number whose geometric sum you want ? ");
//        int q =in.nextInt();
//        System.out.println("Geometric sum : " +gemoetricSum(q));

        System.out.println("------------------------------------------------------------");
        System.out.println("Enter string whose palindrome you want to search ?");
        String str =in.nextLine();
        System.out.println(isPalindrome(str));







    }
}
