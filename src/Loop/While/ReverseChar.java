package Loop.While;

import java.util.Scanner;

public class ReverseChar
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int i=n;
        while(i>=1)
        {
            char ch =(char)(65+n-1);
            int j=n;
            while(j>=i)
            {
                System.out.print(ch);
                ch--;
                j--;
            }
            i--;
            System.out.println();
        }

    }
}
