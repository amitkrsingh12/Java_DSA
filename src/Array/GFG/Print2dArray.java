package Array.GFG;

import java.util.Scanner;

public class Print2dArray
{
    public static void takeInput(int[][] arr)
    {
        System.out.println("Enter array Elements : ");
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=in.nextInt();
            }

        }
    }
    public static void PrintArray(int[][] arr)
    {
        System.out.println("Array elements are :");
        for(int i=0;i<arr.length;i++)
        {
            for(int j = 0; j< arr.length; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter mo of rows of array");
        int n=in.nextInt();
        System.out.println("Enter no of columns of array");
        int m=in.nextInt();
        int[][] arr = new int[n][m];
        takeInput(arr);
        PrintArray(arr);
    }
}
