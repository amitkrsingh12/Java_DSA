package Loop.While;

import java.util.Scanner;

public class GameOfAlphanet
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while (i <= n) {
            char current = 'A';
            int j = 1;
            while (j <= i) {
                System.out.print(current + " ");
                current++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
