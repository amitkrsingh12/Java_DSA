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


    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println("Enter two numbers for multiplication ?");
        int m=in.nextInt();
        int n=in.nextInt();
        System.out.println("Multiplication using Recursion : " +multiplication(m,n));

    }
}
