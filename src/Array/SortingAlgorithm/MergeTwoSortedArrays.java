package Array.SortingAlgorithm;
import java.util.Scanner;
public class MergeTwoSortedArrays
{
    public static int[] MergeSortedArray(int[] arr1,int []arr2)
    {
        int n=arr1.length;
        int m= arr2.length;
        int [] arr3 = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j])
            {
                arr3[k++] =arr1[i++];
            }else{
                arr3[k++] =arr2[j++];
            }
        }
        while(i<n)
        {
            arr3[k++] =arr1[i++];
        }
        while(j<m)
        {
            arr3[k++] = arr2[j++];
        }
        return arr3;
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
        System.out.println("enter size of arr1 :");
        int n=in.nextInt();
        System.out.println("Enter size of array 2 :");
        int m=in.nextInt();
        int arr1[] =new int[n];
        int[] arr2 = new int[m];
        takeInput(arr1);
        takeInput(arr2);
        int[] result =MergeSortedArray(arr1,arr2);
        printArray(result);
    }
}
