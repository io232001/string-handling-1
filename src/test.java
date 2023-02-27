import java.lang.reflect.Array;

public class test
{
    public static void main(String arg[])
    {
        String string1 = "Hello";
        String string2 = "How are you?";
        String firstTwoChars = string1.substring(0, 2);
        String lastTwoChars = string2.substring(string2.length() - 2);
        String combined = firstTwoChars + lastTwoChars;
        char[] charArray = combined.toCharArray();
        System.out.println(charArray);
    }
}

