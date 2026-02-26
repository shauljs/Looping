public class Task_6 {
    public static void main(String[] args) {
        {
            int c = 4;
            int d = 4;

            for (c = 4; c >= 1; c = c - 1)
            {

                for (d = 1; d <= c; d = d + 1)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}