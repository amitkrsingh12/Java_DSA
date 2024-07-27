package Loop.While;

import java.util.Scanner;

public class DescendingOrder
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int i=1;
        int p;
        while(i<=n)
        {
            p=n;
            int j=1;
            while(j<=i)
            {
                System.out.print(p);
                j++;
                p--;
            }
            System.out.println();
            i++;
        }

    }
}
