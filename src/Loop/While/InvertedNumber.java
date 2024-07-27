package Loop.While;

import java.util.Scanner;

public class InvertedNumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int i=n;
        while(i>=1)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print(i);
                j++;
            }
            i--;
            System.out.println();
        }

    }
}
