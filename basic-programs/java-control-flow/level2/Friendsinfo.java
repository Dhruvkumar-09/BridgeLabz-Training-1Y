import java.util.Scanner;

class Friendsinfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amarAge = sc.nextInt();
        double amarHeight = sc.nextDouble();

        int akbarAge = sc.nextInt();
        double akbarHeight = sc.nextDouble();

        int anthonyAge = sc.nextInt();
        double anthonyHeight = sc.nextDouble();

        if (amarAge <= akbarAge && amarAge <= anthonyAge) {

            System.out.println("Amar is the youngest");

        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {

            System.out.println("Akbar is the youngest");

        } else {

            System.out.println("Anthony is the youngest");
        }

        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {

            System.out.println("Amar is the tallest");

        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {

            System.out.println("Akbar is the tallest");

        } else {

            System.out.println("Anthony is the tallest");
        }

        sc.close();
    }
}
