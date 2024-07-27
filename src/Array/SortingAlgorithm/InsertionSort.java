package Array.SortingAlgorithm;

import java.util.Scanner;

public class InsertionSort
{
    public static void Sort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static int[] takeInput(int[] arr)
    {
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();

        }
        return arr;
    }
    public static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Array size?");
        int n=in.nextInt();
        int[] arr = new int[n];
        takeInput(arr);
        Sort(arr);
        printArray(arr);
    }

}
