package Array.GFG;

import java.util.Scanner;

public class CopyArray
{
    public static int[] takeInput(int[] arr)
    {
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();

        }
        return arr;
    }
    public static int[] copyArr(int[] arr)
    {
        int []copiedArray = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            copiedArray[i]=arr[i];
        }
        return copiedArray;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array ?");
        int n=in.nextInt();
        int[] arr = new int[n];
        takeInput(arr);

        int[] copiesArray = copyArr(arr);

        System.out.println("Copied array");
        for(int i=0;i<copiesArray.length;i++)
        {
            System.out.print(copiesArray[i] + " ");
        }
    }
}
