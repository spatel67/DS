public class DS0_CH3
{
    public static int[] fewest(int cents)
    {
        int[] money = new int [10];
        int pennies = 0;
        int nickels = 0;
        int dimes = 0;
        int quarters = 0;
        int dollar = 0;
        int fives = 0;
        int tens = 0;
        int fifties = 0;
        int hundreds = 0;

        if(cents > 10000)
        {
            hundreds = cents%10000;
            cents -= hundreds*10000;
        }

        if(cents > 5000)
        {
            fifties = cents%5000;
            cents -= fifties*5000;
        }

        if(cents > 1000)
        {
            tens = cents%1000;
            cents -= tens*1000;
        }

        if(cents > 500)
        {
            fives = cents%500;
            cents -= fives*500;
        }

        if(cents > 100)
        {
            dollar = cents%100;
            cents -= dollar*100;
        }
        if(cents > 25)
        {
            quarters = cents%25;
            cents -= quarters*25;
        }

        if(cents > 10)
        {
            dimes = cents%10;
            cents -= dimes*10;
        }

        if(cents > 5)
        {
            nickels = cents%5;
            cents -= nickels*5;
        }

        if(cents > 1)
        {
            pennies = cents%5;
            cents -= pennies*5;
        }

        money
        money[0] = pennies;
        money[1] = nickels;
        money[2] = dimes;
        money[3] = quarters;
        money[4] = dollar;
        money[5] = fives;
        money[6] = tens;
        money[7] = fifties;
        money[8] = hundreds;



    }
}
