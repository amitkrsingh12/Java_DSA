package String;

import java.util.Scanner;

public class UserInput
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str;
    //    str =in.next();
    //    System.out.println(str + " " +str.length());
        int i =in.nextInt();
        String str2 =in.nextLine();
        System.out.println(str2 + " " + str2.length());
    }
}
