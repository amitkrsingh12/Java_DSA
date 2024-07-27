package Loop.While;

import java.util.Scanner;

public class TraingularNumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
