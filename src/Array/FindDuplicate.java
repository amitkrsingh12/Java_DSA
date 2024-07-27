package Array;

import java.util.Scanner;

public class FindDuplicate
{
    public static int Duplicates(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    return arr[j];
                }
            }
        }
        return -1;
    }
    public static int[] printInput(int[] arr)
    {
        Scanner in = new Scanner(System.in);
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        return arr;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array?");
        int n=in.nextInt();
        int [] arr = new int[n];
        int [] arr1 =printInput(arr);
        int x =Duplicates(arr);
        System.out.println(x);
    }
}
