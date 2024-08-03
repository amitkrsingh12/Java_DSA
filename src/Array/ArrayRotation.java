package Array;

import java.util.Scanner;

public class ArrayRotation
{
    public static void swap(int[] A,int l,int r)
    {
        int temp =A[l];
        A[l]=A[r];
        A[r]= temp;
    }
    public static void reverseBetween(int[] A,int l,int r)
    {
        r--;
        int len =(r-l)/2;
        for(int i=0;i<=len;i++)
        {
            swap(A,l,r);
            l++;
            r--;
        }
    }
    public static void rotateLeft(int[]A,int n,int X)
    {
        reverseBetween(A,0,n);
        reverseBetween(A,0,n-X);
        reverseBetween(A,n-X,n);
    }
    public static void rotateRight(int[]A,int n,int X)
    {
        reverseBetween(A,0,n);
        reverseBetween(A,0,X);
        reverseBetween(A,X,n);

    }
    public static void rotateArray(int[] A,int n,int X,String dir)
    {
        X =X%n;
        if(X>0 && dir.equals("LEFT"))
        {
            rotateLeft(A,n,X);
        }else if(X>0 && dir.equals("RIGHT")){
            rotateRight(A,n,X);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+ " ");
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int X=in.nextInt();
        String dir = in.next();
        int[] A = new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=in.nextInt();
        }
        rotateArray(A,n,X,dir);
    }
}
