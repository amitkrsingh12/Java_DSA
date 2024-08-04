package String;
import java.util.*;
public class Palindrome
{
    public static boolean Palindrome(String str)
    {
        int left=0;
        int right =str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str =in.nextLine();
        boolean ans = Palindrome(str);
        System.out.println(ans);

    }
}
