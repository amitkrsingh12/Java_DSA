package Array.GFG;

import java.util.Arrays;
import java.util.Scanner;

public class TwoMatricEqualOrNot
{
    public static int[] takeInput(int[] arr)
    {
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        return arr;
    }
    public static boolean MaticesEqualOrNot(int[] x,int[] y)
    {
        if(x.length!=y.length)
        {
            System.out.println("Both matrix are not equal because size of array doesnt match");
            return false;
        }
        boolean result = Arrays.equals(x,y);
        if(result==true)
        {
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Not equal");
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size of arr and arr 1 ?");

        int n=in.nextInt();
        int m =in.nextInt();
        int[] arr = new int[n];
        int[] arr1=new int[m];
        System.out.println("enter array elements of 1st array");
        takeInput(arr);
        System.out.println("enter array elements of 2nd array");
        takeInput(arr1);
        MaticesEqualOrNot(arr,arr1);
    }
}
