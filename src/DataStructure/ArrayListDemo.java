package DataStructure;

import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String args[])
    {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);

        arr.add(1,80);
        arr.remove(1);
        System.out.println("Array List element at 1 " +arr.get(1));
        System.out.println("Array List Elements are : ");
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+ " ");
        }
    }
}
