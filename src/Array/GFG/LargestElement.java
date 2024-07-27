package Array.GFG;

import java.util.Scanner;

public class LargestElement
{
    public static int Largest(int[] arr)
    {
        int largest=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    largest =arr[i];
                }else{
                    largest =arr[j];
                }
            }
        }
        return largest;
    }
    public static int[] takeInput(int[] arr)
    {
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();

        }
        return arr;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array?");
        n=in.nextInt();
        int[] arr = new int[n];
        takeInput(arr);
        System.out.println(Largest(arr));
    }
}
