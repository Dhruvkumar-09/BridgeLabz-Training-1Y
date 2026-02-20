import java.util.Scanner;

class Armstrong {
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
            sum = sum + (digit * digit * digit);
            originalNumber = originalNumber / 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } 
        else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
