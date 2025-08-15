public class DS0_CH2
{
    public static int[] commonNeighbors(int[] list)
    {

        if(list.length == 1)
        {
            list[0] = 0;

        }
        for(int x = 0; x< list.length; x++)
        {
            if(list.length == 1)
            {
                break;
            }

            if(x == 0)
            {
                if(list[x+1] != list[x])
                {
                    list[x] = 0;

                }

            }

            else if(x == list.length-1)
            {
                if(list[x-1] != list[x])
                {
                    list[x] = 0;
                }
            }

            else if(list[x] != list[x+1] && list[x] != list[x-1])
            {
                list[x] = 0;

            }


        }
        return list;
    }
}
