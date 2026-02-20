import java.util.Scanner;

class Comparesum2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("The number is not a natural number");
            return;
        }

        int sumfor = num * (num + 1) / 2;

        int sumloop = 0;

        for (int i = num; i >= 1; i--) {

            sumloop = sumloop + i;
        }

        System.out.println("sum from for is " + sumloop +
                           " and sum from formula is " + sumfor);

        if (sumloop == sumfor) {
            System.out.println("Both results are correct");
        } else {
            System.out.println("Results are not equal");
        }

        sc.close();
    }
}
