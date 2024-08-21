package DataStructure;
import java.util.ArrayList;
import java.util.Scanner;
/*
arr [10,10,20,20,20,30,40,10]
output : 10 20 30 40 10
 */
public class RemoveConsecutiveElements
{
    public static ArrayList<Integer> removeConsecutiveDuplicates(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] !=arr[i-1])
            {
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        ArrayList <Integer > result = removeConsecutiveDuplicates(arr);
        for(int i:result){
            System.out.println(i);
        }
    }
}
