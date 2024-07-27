package Loop.While;

import java.util.Scanner;

public class MirrorNumberPattern
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n-i+1)
            {
                System.out.print(" ");
                j++;
            }
            int stars=1;
            while(stars<=i)
            {
                System.out.print("*");
                stars++;
            }
            i++;
            System.out.println();
        }
    }
}
