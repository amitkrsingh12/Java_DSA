/*
E
DE
CDE
BCDE
ABCDE
 */
package Loop.While;
import java.util.Scanner;
public class InterestingAlphabets
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int i=n;
        while(i>=1)
        {
            int j=i;
            char ch=(char)(64+i);
            while(j<=n)
            {
                System.out.print(ch);
                ch++;
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
