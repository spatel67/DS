import java.time.format.*;
import java.util.*;
import java.io.*;
import java.time.*;
public class AccessedOn
{
    public static void main(String[] args)
    {
        try
        {
            File fromFile = new File("AccessedOn.txt");
            FileWriter fileWriter = new FileWriter(fromFile,false);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            Scanner keyboard = new Scanner(fromFile);
            if(!fromFile.exists())
            {
                fromFile.createNewFile();
            }

            LocalDateTime dT = LocalDateTime.now();
            DateTimeFormatter dtform = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formattedDate = dT.format(dtform);
            printWriter.println(formattedDate + " " + LocalDate.now().getDayOfWeek().name());
            fileWriter.close();
            printWriter.close();

            while(keyboard.hasNextLine())
            {
                System.out.println(keyboard.nextLine());
            }

        }



        catch(Exception e)
        {
            e.printStackTrace();
        }


    }



}
