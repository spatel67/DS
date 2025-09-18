import java.time.format.*;
import java.util.*;
import java.io.*;
import java.time.*;
public class AccessedOn
{

    //found information on w3schools
    public static void main(String[] args)
    {
        try
        {
            File fromFile = new File("AccessedOn.txt");
            FileWriter fileWriter = new FileWriter(fromFile,true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            Scanner keyboard = new Scanner(fromFile);
            if(!fromFile.exists())
            {
                fromFile.createNewFile();
            }

            LocalDateTime dT = LocalDateTime.now();
            DateTimeFormatter dtform = DateTimeFormatter.ofPattern(" dd-MM-yyyy HH:mm:ss");
            String formattedDate = dT.format(dtform);
            printWriter.println(LocalDate.now().getDayOfWeek().name() + formattedDate + " CDT");
            fileWriter.close();
            printWriter.close();


        }



        catch(Exception e)
        {
            e.printStackTrace();
        }


    }



}
