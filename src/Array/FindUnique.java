package Array;

import java.util.Scanner;

public class FindUnique
{
    public static int Unique(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int count =0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }

            }
            if(count==1)
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static int[] printInput(int[] arr)
    {
        Scanner in = new Scanner(System.in);
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        return arr;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array ?");
        int n;
        n=in.nextInt();
        int [] arr=new int[n];
        int [] arr1 = printInput(arr);
        int x= Unique(arr1);
        System.out.println(x);

    }
}
