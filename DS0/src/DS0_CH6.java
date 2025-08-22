import java.util.ArrayList;
public class DS0_CH6
{


    public static ArrayList<Integer> absoluteDifference(ArrayList<Integer> listA, ArrayList<Integer> listB)
    {
        int diff = 0;
        ArrayList<Integer> abs = new ArrayList<Integer>();
        for(int x = 0; x<listA.size(); x++)
        {
            diff = Math.abs(listA.get(x) - listB.get(x));
            abs.set(x, diff);

        }

        return abs;
    }
}
