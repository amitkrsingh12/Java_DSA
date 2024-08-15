package Recursion.SortingAlgorithm;

import java.util.Scanner;

public class BinarySearch
{
    public static int search(int[] arr ,int start,int end,int search)
    {
        if(start>end)
        {
            return -1;
        }
        int middleIndex =(start+end)/2;
        if(arr[middleIndex]==search)
        {
            return middleIndex;
        }else if(arr[middleIndex]<0)
        {
           // start = middleIndex+1;
            return search(arr,middleIndex+1,end,search);
        }
        else{
            return search(arr,start,middleIndex-1,search);
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size ?");
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println(search(arr,0,n,10));

    }
}
