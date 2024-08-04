package String;

import java.util.Scanner;

public class PrintAllCharsInSeparateLines
{
    public static void SeparateLines(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }

    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        SeparateLines(str);
    }
}
