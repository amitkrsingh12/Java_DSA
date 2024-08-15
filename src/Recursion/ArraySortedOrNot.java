package Recursion;

import java.util.Scanner;

public class ArraySortedOrNot
{
    public static boolean Sorted(int [] arr,int startIndex)
    {
        if(startIndex ==arr.length-1)
        {
            return true;
        }
        if(arr[startIndex]>arr[startIndex+1])
        {
            return false;
        }
        return Sorted(arr,startIndex+1);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size ?");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please insert array elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println(Sorted(arr,0));
    }
}
