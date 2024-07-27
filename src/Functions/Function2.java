package Functions;

import java.util.Scanner;

public class Function2
{
    public static boolean isPrime(int n)
    {
        int div=2;
        while(div<=n/2)
        {
            if(n%div==0)
            {
                return false;
            }
            div++;
        }
        return true;
    }
/*
Dry run
n=8
2<=8 : 2%8 ==0 return false
n=11
2<=11 2%11 ==0 no
3<=11 3%11 ==0 no
4<=11 4%11 ==0 no
5<=11 5%11 ==0 no
 */
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.close();
        System.out.println(isPrime(n));

    }
}
