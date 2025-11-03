import java.io.File;
import java.util.Scanner;

public class DS3_SetJoins
{
    public static void main(String[] args)
    {
        String fName = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the file name:");
        fName = keyboard.next();

        try
        {
            File file = new File(fName);





        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
