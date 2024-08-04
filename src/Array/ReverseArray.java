package Array;

import java.util.Scanner;

public class ReverseArray
{
    public static int[] reverseArray(int[] arr)
    {
        int[] arr1 = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arr1[i]=arr[arr.length-i-1];
        }
        return arr1;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int[] rev =reverseArray(arr);
        for(int i=0;i<rev.length;i++)
        {
            System.out.print(rev[i]+ " ");
        }
    }
}
