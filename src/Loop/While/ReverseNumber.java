package Loop.While;

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while(i<=n)
        {
            int j=i;
            while(j>=1)
            {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
