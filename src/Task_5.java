public class Task_5 {
    public static void main(String[] args)
    {
        int a = 1;
        int b = 1;

        for (a = 1; a <= 4; a++)
        {
            for (b = 1; b <= a; b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

