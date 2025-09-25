import java.util.*;
import java.io.*;
public class DS2_Printer_Queue
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Enter job file name:");
            Scanner lala = new Scanner(System.in);
            File fromFile = new File(lala.next());


            FileWriter fileWriter = new FileWriter(fromFile,true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            Scanner keyboard = new Scanner(fromFile);
            if(!fromFile.exists())
            {
                fromFile.createNewFile();
            }


            while (keyboard.hasNextLine())
            {
                MyQueue
            }



        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
