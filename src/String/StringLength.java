package String;
import java.util.*;
public class StringLength
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count=0;
        for(char c :str.toCharArray())
        {
            count++;
        }
        System.out.println(count);
    }
}
