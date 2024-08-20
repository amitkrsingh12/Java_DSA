package Recursion;

import java.util.Scanner;

public class TowerofHanoi
{
    public static void towerHanoi(int n,char start ,char helper, char destination)
    {
        if(n==1){
            System.out.println("Move 1st disk from " +start+ " to "+destination);
            return;
        }
        towerHanoi(n-1,start,destination,helper);
        System.out.println("Move " +n+ " th disk from "+start+" to " +destination);
        towerHanoi(n-1,helper,start,destination);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
       towerHanoi(n,'s','h','d');
    }
}
