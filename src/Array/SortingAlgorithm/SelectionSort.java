package Array.SortingAlgorithm;

import java.util.Scanner;

public class SelectionSort
{
    public static void Sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int smallest =i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[smallest])
                {
                    smallest =j;
                }
            }
            int temp =arr[smallest];
            arr[smallest]=arr[i];
            arr[i] =temp;
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
        System.out.println("enter size of array ?");
        int n=in.nextInt();
        int[] arr= new int[n];
        takeInput(arr);
        Sort(arr);
        printArray(arr);

    }
}
