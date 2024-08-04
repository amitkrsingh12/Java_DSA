package String;

public class PlayingWithFunctions
{
    public static void main(String args[])
    {
        String str1 = "Coding ";
        String str2 = "is fun";
        String str3 = "Ceding";
        str1 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str1.equals(str3));
        System.out.println(str1.compareTo(str3));
    //    str1+=str2;
    //    System.out.println(str1);
        /*
        concat adds two strings
        equals check string are equal or not
        compareTo check how much similarity between both the strings and returns difference between
        ASCII values of both changed values.
         */
    }
}
