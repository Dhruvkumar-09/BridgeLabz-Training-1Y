import java.util.Scanner;

class Harshad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int originalNumber;
        int sum = 0;
        int digit;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        originalNumber = number;

        while (originalNumber != 0) {
            digit = originalNumber % 10;
            sum = sum + digit;
            originalNumber = originalNumber / 10;
        }

        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        }
        else {
            System.out.println(number + " is NOT a Harshad Number.");
        }

        sc.close();
    }
}
