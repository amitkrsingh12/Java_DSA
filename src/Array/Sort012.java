package Array;

import java.util.Scanner;

/*
You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s.
 Write a solution to sort this array/list in a 'single scan'.

'Single Scan' refers to iterating over the array/list just once or to put it
in other words, you will be visiting each element in the array/list just once.

Sample Input 1:
1
7
0 1 2 0 2 0 1
Sample Output 1:
0 0 0 1 1 2 2
Explanation:  The array contains three 0s, two 1s, and two 2s.
 After sorting the array in a single scan, the 0s should come first,
 then the 1s, and finally the 2s. So the output is 0 0 0 1 1 2 2.
 */
public class Sort012
{
    public static void Sort(int[] arr)
    {
        int low=0,high=arr.length-1,mid=0;
        while(mid<=high)
        {
           switch(arr[mid])
           {
               case 0:
                   int temp =arr[low];
                   arr[low]=arr[mid];
                   arr[mid]=temp;
                   low++;
                   mid++;
                   break;
               case 1:
                   mid++;
                   break;
               case 2:
                   // Swap arr[mid] and arr[high]
                   int temp2 = arr[high];
                   arr[high] = arr[mid];
                   arr[mid] = temp2;
                   high--;
                   break;
           }
        }
    }
    public static int[] takeInput(int[] arr)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements ?");
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
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size");
        int n=in.nextInt();
        int[] arr = new int[n];
        takeInput(arr);
        Sort(arr);
        printArray(arr);
    }
}
