import java.util.*;
import java.io.*;
public class DS2_Printer_Queue
{
    public static void main(String[] args)
    {
        MyQueue<Job> queue= new MyQueue<>();

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

            int x = 0;
            int subTime = 0;
            int page = 0;


            while (keyboard.hasNextLine())
            {
                x++;
                String[] sigma = keyboard.nextLine().split(",");
                subTime = Integer.parseInt(sigma[0]);
                page = Integer.parseInt(sigma[1]);
                Job job = new Job(x, subTime, page);
                queue.offer(job);

            }



            for(int a = 1; a<=x; a++)
            {
                System.out.println("Time " + queue.element().getSubmissionTime() + "s: Job #" + a + " Recieved (" + queue.element().getPages()+ " pages)");
                System.out.println("Time " + queue.element().getBufferingStart() + "s: Job #" + a + " Buffering Started");
                System.out.println("Time " + (queue.element().getBufferingStart() +3) + "s: Job #" + a + " Finished Buffering and Started Printing");
                System.out.println("Time " + (queue.element().getBufferingStart() + 3+ (queue.poll().getPages()*5))  + "s: Job #" + a + " Finished Printing");
                System.out.println("");

            }


            System.out.println("Printing Simulation Complete.");
            System.out.println("");
            System.out.println("Total Print Jobs: " + x);
            System.out.println("Average Wait Time: ") ;





        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
