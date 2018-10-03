import java.util.Arrays;
import java.util.*;

public class Funcs
{
    static String Capitalize(final String s)
    {
        //split string by spaces
        String[] separatedStr = s.split(" ");
        //empty array the size of input string
        String[] cap = new String[separatedStr];
        //iterate and capitalize
        for(int i = 0; i < cap.length; i++)
        {
            cap[i].substring(0, 1).toUpperCase();

        }
        return Arrays.toString(cap);
    }
}
