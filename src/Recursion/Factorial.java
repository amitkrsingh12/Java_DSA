package Recursion;

import java.util.Scanner;

public class Factorial {

    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }

    public static int arraySum(int[] input) {
        int n = input.length;
        if (n == 0) {
            return 0;
        }
        int[] smaller = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            smaller[i] = input[i];
        }
        return arraySum(smaller) + input[n - 1];
    }
    public static void main(String args[])
    {
        Scanner in =  new Scanner(System.in);

        System.out.println("Enter the number whose factorial you want ?");
        int n=in.nextInt();
        System.out.println("Factorial Function "+fact(n));
    }
}
