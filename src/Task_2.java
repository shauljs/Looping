public class Task_2 {

    public static void main(String[] args) {

        // Declarations
        int sum = 15;

        System.out.print("Display:" + sum + ",");
        while (sum > 1) {
            sum = sum - 1;
            System.out.print(+sum + ",");
        }
        sum = 0;
        System.out.print(+sum + ".");

        System.out.println();

        int sum3 = 0;
        System.out.print("Display:" + sum3 + ",");
        while(sum3 < 75)
        {
            sum3 = sum3 + 5;
            System.out.print(sum3 + ",");
        }
        sum3 = 75;
        System.out.print(sum3 + ".");
    }
}
