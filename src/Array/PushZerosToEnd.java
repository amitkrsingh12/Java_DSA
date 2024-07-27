package Array;

import java.util.Scanner;

public class PushZerosToEnd {
    public static void PushZeros(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {


           if(arr[i]!=0)
           {
               int temp=arr[count];
               arr[count]=arr[i];
               arr[i]=temp;
               count++;
           }

        }
    }
    public static int[] takeInput(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Array size?");
        int n=in.nextInt();
        int[] arr = new int[n];
        takeInput(arr);
        PushZeros(arr);
        printArray(arr);
    }

}
