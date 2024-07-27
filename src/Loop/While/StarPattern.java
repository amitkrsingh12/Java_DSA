package Loop.While;

import java.util.Scanner;

public class StarPattern
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int i=1;
        while(i<=n)
        {
            int j=1;
            int numstars =2*i-1;
            while(j<n-i)
            {
                System.out.print(" ");
                j++;
            }
            int stars =0;
            while(stars<numstars)
            {
                System.out.print("*");
                stars++;
            }
            i++;
            System.out.println();

        }
    }
}
