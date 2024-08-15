package Recursion;

import java.util.Scanner;

public class CountZeros
{
    public static int countZeros(int input)
    {
        if(input==0)
        {
            return 1;
        }
        if(input<10)
        {
            return 0;
        }
        if(input%10==0)
        {
            return 1 +countZeros(input/10);
        }
        return countZeros(input/10);
    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(countZeros(n));

    }
}
