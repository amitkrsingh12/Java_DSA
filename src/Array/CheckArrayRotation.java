/*
You have been given an integer array/list(ARR) of size N.
It has been sorted(in increasing order) and then rotated by
some number 'K' (K is greater than 0) in the right hand direction.
Your task is to write a function that returns the value of 'K',
that means, the index from which the array/list has been rotated.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
1
6
5 6 1 2 3 4
Sample Output 1:
2
Sample Input 2:
2
5
3 6 8 9 10
4
10 20 30 1
Sample Output 2:
0
3
 */
package Array;
import java.util.Scanner;

public class CheckArrayRotation
{
    public static int Rotation(int[] arr)
    {
        int left=0,right = arr.length-1;
        while(left<right)
        {
            int mid=(right+left)/2;
            if(arr[mid]>arr[right])
            {
                left =mid+1;
            }else{
                right=mid;
            }
        }
        return left;
        /*
        4 5 1 2 3
        left=0,right=5-1=4
        mid =2
        arr[mid]>arr[right]=> 1 >3 no
        right = mid => 2
        now left = 0,right =2
        mid =1
        arr[mid]>arr[right]=>5>1 true
        left = mid+1=> 1+1=2
         */
    }
    public static int[] InputArray(int[] arr)
    {
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        return arr;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array sisze ?");
        int n=in.nextInt();
        int [] arr = new int[n];
        InputArray(arr);
        System.out.println(Rotation(arr));
    }
}
