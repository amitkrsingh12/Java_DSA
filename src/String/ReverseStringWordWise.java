package String;
import java.util.Scanner;
public class ReverseStringWordWise
{
    public static String ReverseStringWordWise(String str)
    {
        String[] words = str.split(" ");
        int left=0,right=words.length-1;
        while(left<right)
        {
            String temp =words[left];
            words[left]=words[right];
            words[right]=temp;
            left++;
            right--;
        }
        return String.join(" ",words);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str =in.nextLine();
        String result =ReverseStringWordWise(str);
        System.out.println(result);

    }
}
