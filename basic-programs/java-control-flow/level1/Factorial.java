import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Please enter a positive integer");
            return;
        }

        int fact = 1;
        int i = num;

        while (i > 0) {

            fact = fact * i;
            i--;
        }

        System.out.println("Factorial of " + num + " is " + fact);

        sc.close();
    }
}
