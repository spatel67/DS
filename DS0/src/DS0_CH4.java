public class DS0_CH4
{
    public static boolean balanced(int[][] grid)
    {
        int rightSum = 0;
        int leftSum = 0;
        boolean balanced = false;
        for(int x = 0; x<grid.length; x++)
        {
            for(int y = 0; y<grid[0].length; y++)
            {
              if(x == y)
              {
                  continue;
              }

              if(x<y)
              {
                  rightSum+=grid[x][y];
              }

              if (y<x)
              {
                  leftSum+=grid[x][y];
              }




            }
        }

        if(leftSum == rightSum)
        {
            balanced = true;
        }

        return balanced;











    }
}
