package Array;

import java.util.Scanner;

public class CountArrayItems
{
    public static int CountArray(int[] arr)
    {
        int count=0;
        for(int element : arr)
        {
            count++;
        }
        return count++;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size ?");
        int n= in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] =in.nextInt();
        }
        int result =CountArray(arr);
        System.out.println(result);
    }
}
