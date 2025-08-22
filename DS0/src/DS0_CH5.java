import java.util.ArrayList;
public class DS0_CH5
{
    public static void removeAllInRange(ArrayList<Integer> numbers, int lower, int upper)
    {

        for(int x = 0; x<numbers.size(); x++)
        {
            if(numbers.get(x) >= lower && numbers.get(x) <= upper)
            {
               numbers.set(x, null);
            }
        }
    }

}
