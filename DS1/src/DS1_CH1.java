import java.io.*;
import java.util.*;

public class DS1_CH1
{
    public static int[] sumLines(String fileName)
    {
        ArrayList<Integer> sums = new ArrayList<Integer>();


        try
        {
            Scanner keyboard = new Scanner(new File(fileName));
            while (keyboard.hasNextLine())
            {
                String line = keyboard.nextLine();


                Scanner keyboard1 = new Scanner(line);
                keyboard1.useDelimiter(",");

                int sum = 0;
                while (keyboard1.hasNextInt())
                {
                    sum += keyboard1.nextInt();
                }
                sums.add(sum);

                keyboard1.close();
            }
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }


        int[] result = new int[sums.size()];
        for (int i = 0; i < sums.size(); i++)
        {
            result[i] = sums.get(i);
        }
        return result;
    }




}

