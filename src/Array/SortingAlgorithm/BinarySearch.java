package Array.SortingAlgorithm;

import java.util.Scanner;

public class BinarySearch
{
    public static int Binary(int[] arr,int target)
    {
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int middle =(start +(end-start))/2;
            if(arr[middle]==target)
            {
                return middle;
            }
            // 10 20 30 40 50 60 , 50
            if(arr[middle]<target)
            {
                start = middle+1;
            }else{
                end =middle-1;
            }
        }
        return -1;
    }
    public static int[] takeInput(int[] arr)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements :");
        for(int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of arr");
        int n=in.nextInt();
        System.out.println("enter target");
        int target =in.nextInt();
        int [] arr = new int[n];
        takeInput(arr);
        int result =Binary(arr,target);
        System.out.println(result);


    }
}
