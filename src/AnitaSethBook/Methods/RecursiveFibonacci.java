package AnitaSethBook.Methods;

import java.util.Scanner;
class Fibonacci{
    int fibonacci(int n)
    {
        if(n==0||n<2)
        {
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
public class RecursiveFibonacci
{
    public static void main(String args[])
    {

        Fibonacci obj = new Fibonacci();
        for(int i=0;i<10;i++)
        {
            System.out.print(obj.fibonacci(i)+" ");
        }
    }
}
