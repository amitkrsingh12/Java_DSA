package Recursion;

import java.util.Scanner;

public class countDigits
{
    public static int countDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return 1 + countDigits(n/10);
    }
    public static void main(String argsp[])
    {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter digits whose sum you want to count ?");
        int x=in.nextInt();
        System.out.println("Count Digits : "+countDigits(x));





    }
}
