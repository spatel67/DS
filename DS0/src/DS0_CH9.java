public class DS0_CH9
{
    public static int summation(int A, int B)
    {
        if(A==B)
        {
            return A;
        }

        return A + summation(A+1, B);

    }
}
