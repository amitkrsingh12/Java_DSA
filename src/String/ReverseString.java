package String;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String str)
    {
        String reverse ="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse += str.charAt(i);
        }
        return reverse;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        String result = reverseString(str);
        System.out.println(result);

    }
}
