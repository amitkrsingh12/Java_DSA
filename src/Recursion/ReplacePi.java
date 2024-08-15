package Recursion;

public class ReplacePi
{
    public static String replace(String n)
    {
        if(n.length()==0)
        {
            return n;
        }
        if(n.charAt(0)=='p' && n.charAt(1)=='i')
        {
            String smallOutput = replace(n.substring(2));
            return 3.14 +smallOutput;
        }else{
            String smallOutput = replace(n.substring(1));
            return n.charAt(0)+smallOutput;
        }
    }
    public static void main(String args[])
    {
        System.out.println(replace("piamitsinghpi"));
    }
}
