package String;

import java.util.Scanner;

public class CountWords
{
    public static int Count(String str)
    {
        int count=1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)== ' ')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        int result = Count(str);
        System.out.println(result);
    }
}
