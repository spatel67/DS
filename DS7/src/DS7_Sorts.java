public class DS7_Sorts
{
    public static void selectionSort(int[] list)
    {
        int minindex = 0;
        for(int a = 0; a<list.length; a++)
        {
            minindex = a;
            for (int b = a+1; b<list.length; b++)
            {
                if(list[b] < list[minindex])
                {
                    minindex = b;
                }
            }

        }

    }

    public static void insertionSort(int[] list)
    {
        int temp = 0;
        for(int i = 1; i< list.length; i++)
        {
            temp = list[i];
        }
    }
}
