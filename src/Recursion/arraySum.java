package Recursion;

import java.util.Scanner;

public class arraySum
{
    public static int arraySum(int[] input)
    {
        int n=input.length;
        if(n==0)
        {
            return 0;
        }
        int[] smaller = new int[n-1];
        for(int i=0;i<n-1;i++)
        {
            smaller[i]=input[i];
        }
        return arraySum(smaller) + input[n-1];
    }
    public static void takeInputArray(int [] arr)
    {
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        in.close();
    }
    public static void main(String argsp[])
    {
        Scanner in =  new Scanner(System.in);

        ;

        System.out.println("Enter array size ?");
        int y =in.nextInt();
        int[] arr = new int[y];
        takeInputArray(arr);
        System.out.println("Array sum "+arraySum(arr));




    }
}
