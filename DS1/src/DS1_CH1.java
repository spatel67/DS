import java.io.*;
import java.util.*;
public class DS1_CH1
{
    public static int[] sumLines(String fileName)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int sum = 0;

        try
        {
            File fileref = new File("fileName");
            Scanner keyboard = new Scanner(fileref);


            while(keyboard.hasNextLine())
            {
                Scanner fromText = new Scanner(keyboard.nextLine()).useDelimiter("[,]");
                while (fromText.hasNextInt())
                {
                    sum +=fromText.nextInt();

                }
                nums.add(sum);
            }


        }


        catch (Exception e)
        {
            e.printStackTrace();
        }

        int[] numArray = new int[nums.size()];

        for(int x = 0; x<numArray.length; x++)
        {
            numArray[x] = nums.get(x);
        }

        return numArray;









    }
}
