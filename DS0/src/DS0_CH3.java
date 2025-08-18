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
        int twenties = 0;
        int fifties = 0;
        int hundreds = 0;

        if(cents >= 10000)
        {
            hundreds = cents/10000;
            cents -= hundreds*10000;
        }
        System.out.println(hundreds);
        System.out.println(cents);

        if(cents >= 5000)
        {
            fifties = cents/5000;
            cents -= fifties*5000;
        }
        System.out.println(fifties);
        System.out.println(cents);

        if(cents >= 2000)
        {
            twenties = cents/2000;
            cents -= twenties*2000;
        }
        System.out.println(twenties);
        System.out.println(cents);



        if(cents >= 1000)
        {
            tens = cents/1000;
            cents -= tens*1000;
        }
        System.out.println(tens);
        System.out.println(cents);

        if(cents >= 500)
        {
            fives = cents/500;
            cents -= fives*500;
        }
        System.out.println(fives);
        System.out.println(cents);

        if(cents >= 100)
        {
            dollar = cents/100;
            cents -= dollar*100;
        }
        System.out.println(dollar);
        System.out.println(cents);
        if(cents >= 25)
        {
            quarters = cents/25;
            cents -= quarters*25;
        }
        System.out.println(quarters);
        System.out.println(cents);

        if(cents >= 10)
        {
            dimes = cents/10;
            cents -= dimes*10;
        }
        System.out.println(dimes);
        System.out.println(cents);

        if(cents >= 5)
        {
            nickels = cents/5;
            cents -= nickels*5;
        }
        System.out.println(nickels);
        System.out.println(cents);



        money[0] = cents;
        money[1] = nickels;
        money[2] = dimes;
        money[3] = quarters;
        money[4] = dollar;
        money[5] = fives;
        money[6] = tens;
        money[7] = twenties;
        money[8] = fifties;
        money[9] = hundreds;
        return money;



    }
}
