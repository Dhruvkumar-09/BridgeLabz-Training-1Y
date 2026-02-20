import java.util.Scanner;

class Factorial2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Please enter a positive integer");
            return;
        }

        int fact = 1;

        for (int i = num; i >= 1; i--) {

            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is " + fact);

        sc.close();
    }
}
