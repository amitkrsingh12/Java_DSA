package String;
/*
String Pool Concept
 */
public class HowStringsAreStored
{
    public static void main(String args[])
    {
        String str ="abc";
        String str1="abc";
        String str2 = new String("abc");
        System.out.println("Str   : "+System.identityHashCode(str));
        System.out.println("Str 1 : "+System.identityHashCode(str));

    }
}
