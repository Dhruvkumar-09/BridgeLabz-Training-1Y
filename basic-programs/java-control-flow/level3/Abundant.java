import java.util.Scanner;

class Abundant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        }
        else {
            System.out.println(number + " is NOT an Abundant Number.");
        }

        sc.close();
    }
}
