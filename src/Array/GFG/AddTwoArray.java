package Array.GFG;
import java.util.Scanner;

public class AddTwoArray
{
    public static void takeInput(int[] arr)
    {
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
    }
    public static int[] AddTwoMatrices(int[] arr,int[] arr1)
    {
        if(arr.length!=arr1.length)
        {
            throw new IllegalArgumentException("Both arrays must have same lengths");
        }
        int n=arr.length;
        int[] arr3 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr3[i] = arr[i]+arr1[i];
        }
        return arr3;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size of both arrays ?");
        int n=in.nextInt();
        int m=in.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[m];
        takeInput(arr);
        takeInput(arr1);
        int[] result =AddTwoMatrices(arr,arr1);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }



    }
}
