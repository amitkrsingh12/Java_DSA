package Array.TwoDimensionalArray;

import java.util.Scanner;

public class MatrixMultiplication
{
    public static int[][] takeInput()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no of rows");
        int rows=in.nextInt();
        System.out.println("enter number of cols");
        int col =in.nextInt();
        int[][] arr = new int[rows][col];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        return arr;
    }
    public static void printElements(int[][] arr)
    {

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] MatrixMultiplication(int[][] arr,int[][] arr1)
    {
        int row1 =arr.length;
        int col1 =arr[0].length;
        int row2 =arr1.length;
        int col2=arr1[0].length;
//        if(row2!=col1)
//        {
//            System.out.println("Multiplication not possible");
//            return new int[0][0];
//        }
        int [][] result = new int[row1][col2];

        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                for(int k=0;k<col1;k++)
                {
                    result[i][j] +=arr[i][k] *arr1[k][j];
                }
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        int[][] arr = takeInput();
        int[][] arr2 = takeInput();
        System.out.println("Matrix 1 is : ");
        printElements(arr);
        System.out.println("Matrix 2 is : ");
        printElements(arr2);
        int[][] result = MatrixMultiplication(arr,arr2);
        printElements(result);
    }
}
