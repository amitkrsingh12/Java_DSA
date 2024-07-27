package Loop.While;

import java.util.Scanner;

public class AlphaPattern {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        char ch ='A';
        while(i<=n)
        {
            int j=1;

            while(j<=i)
            {
                System.out.print(ch);
                j++;
            }
            System.out.println();
            i++;
            ch++;
        }
    }
}
