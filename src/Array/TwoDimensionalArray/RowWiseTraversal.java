package Array.TwoDimensionalArray;

import java.util.Scanner;

public class RowWiseTraversal
{
    public static int[] printRowWise(int[][] arr)
    {
        int rows= arr.length;
        int cols =arr[0].length;
        int[] result = new int[rows*cols];
        int index=0;
        System.out.println("cols length :"+cols);
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                result[index++]=arr[i][j];
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,m;
        System.out.println("enter rows and cols :");
        n=in.nextInt();
        m=in.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int[] ans = new int[n*m];
        ans = printRowWise(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
        System.out.println();



    }
}
