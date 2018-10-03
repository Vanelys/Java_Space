import java.util.Scanner;

public class TitleCase extends Funcs
{
    public static void main(String[] args)
    {
        System.out.print("Enter a sentence: ");
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();

        System.out.println(Capitalize(line));
        // System.out.println(toCap(line));
        // System.out.println(convertToCap(line));
    }
}
