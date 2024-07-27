package Loop.While;

import java.util.Scanner;

public class CharacterPattern
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        char ch = 'A';
        while (i <= n)
        {
            int j=1;
            char current = ch;
            while(j<=i)
            {
                System.out.print(current);
                current++;
                j++;
            }
            ch++;
            System.out.println();
            i++;
        }
    }
}
