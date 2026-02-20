import java.util.Scanner;

class Employeebonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        int years = sc.nextInt();

        double bonus = 0;

        if (years > 5) {

            bonus = salary * 0.05;

            System.out.println("Bonus amount is " + bonus);

        } else {

            System.out.println("No bonus");
        }

        sc.close();
    }
}
