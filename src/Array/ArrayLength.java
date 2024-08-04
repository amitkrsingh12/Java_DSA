package Array;

import java.util.Scanner;

public class ArrayLength
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int[] array ={1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,18};
        int count=0;
        for(int elem : array)
        {
            count++;
        }
        System.out.println(count);
    }
}
