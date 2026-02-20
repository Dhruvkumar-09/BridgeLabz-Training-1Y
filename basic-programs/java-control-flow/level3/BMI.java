import java.util.Scanner;

class BMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight;
        double heightCm;
        double heightM;
        double bmi;

        System.out.print("Enter weight in kg: ");
        weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        heightCm = sc.nextDouble();

        heightM = heightCm / 100;

        bmi = weight / (heightM * heightM);

        System.out.println("BMI: " + bmi);

        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status: Normal");
        }
        else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Status: Overweight");
        }
        else {
            System.out.println("Status: Obese");
        }

        sc.close();
    }
}
