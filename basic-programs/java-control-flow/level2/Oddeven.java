import java.util.Scanner;

class Oddeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Please enter a natural number");
            return;
        }

        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }

        sc.close();
    }
}
