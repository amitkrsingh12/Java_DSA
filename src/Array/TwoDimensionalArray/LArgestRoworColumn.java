package Array.TwoDimensionalArray;

import java.util.Scanner;

public class LArgestRoworColumn
{
    public static void findLargest(int mat[][]){
        //Your code goes here
        int rows=mat.length;
        if(rows==0)
        {
            System.out.println("rows " +Integer.MIN_VALUE);
            return;
        }
        int cols =mat[0].length;

        int largestCol =Integer.MIN_VALUE;
        int largestColIndex =-1;
        for(int j=0;j<cols;j++)
        {
            int colSum=0;
            for(int i=0;i<rows;i++)
            {
                colSum +=mat[i][j];
            }
            if(largestCol<colSum)
            {
                largestCol =colSum;
                largestColIndex=j;
            }
        }
        int largestRow =Integer.MIN_VALUE;
        int largestRowIndex=-1;
        for(int i=0;i<rows;i++)
        {
            int rowSum =0;
            for(int j=0;j<cols;j++)
            {
                rowSum +=mat[i][j];
            }
            if(largestRow<rowSum)
            {
                largestRow = rowSum;
                largestRowIndex =i;
            }
        }
        if(largestRow>=largestCol)
        {
            System.out.println("row "+ largestRowIndex +" "+ largestRow);
        }else
        {
            System.out.println("column "+largestColIndex +" "+ largestCol);
        }

    }
    public static void main(String args[]) {
        int  m, n;
        Scanner sr = new Scanner(System.in);

        n = sr.nextInt();
        m = sr.nextInt();
        int ar[][] = new int[n][m]; // Swap n and m in array dimensions
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                ar[i][j] = sr.nextInt();
            }
        }
        findLargest(ar);

    }
}
