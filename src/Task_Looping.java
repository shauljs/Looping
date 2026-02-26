
public class Task_Looping {

    public static void main(String[] args)
    {

        // Declarations
        //Task 1
        int sum1 = 0;
        //Task 2
        int sum2 = 15;
        //Task 3
        int sum3 = 0;
        //Task 4
        int sum4 = 18;
        //Task 5
        int a = 1;
        int b = 1;
        //Task 6
        int c = 4;
        int d = 4;
        //Task 7
        int e = 1;
        int f = 1;

        System.out.print("Display Task 1:" + sum1 + ",");
        while (sum1 < 23) {
            sum1 = sum1 + 1;
            System.out.print(+sum1 + ",");
        }
        sum1 = 24;
        System.out.print(+sum1 + ".");
        System.out.println();
        System.out.print("Display Task 2:" + sum2 + ",");
        while (sum2 > 1) {
            sum2 = sum2 - 1;
            System.out.print(+sum2 + ",");
        }

        sum2 = 0;
        System.out.print(+sum2 + ".");


        System.out.println();

        System.out.print("Display Task 3:" + sum3 + ",");
        while (sum3 < 70)
        {
            sum3 = sum3 + 5;
            System.out.print(sum3 + ",");
        }
        sum3 = 75;
        System.out.print(sum3 + ".");

        System.out.println();

        System.out.print("Display Task 4:" + sum4 + ",");
        while (sum4 > 3)
        {
            sum4 = sum4 - 2;
            System.out.print(+sum4 + ",");
        }
        sum4 = 0;
        System.out.print(+sum4 + ".");

        System.out.println();

        System.out.print("Display Task 5:");

        System.out.println();

        for (a = 1; a <= 4; a++)
        {
            for (b = 1; b <= a; b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Display Task 6:");
        for (c = 4; c >= 1; c = c - 1)
        {

            for (d = 1; d <= c; d = d + 1)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Display Task 7:");

        for (e = 1; e <= 3; e++)
        {
            for (f = 1; f <= 4; f++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


