import java.util.Scanner;
class Switch {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter a number between 1 to 7: ");
int weekDayNumber = input.nextInt();
switch (weekDayNumber) {
case 1:
System.out.println("janaury");
break;
case 2:
System.out.println("Fabuary");
break;
case 3:
System.out.println("march");
break;
case 4:
System.out.println("April");
break;
case 5:
System.out.println("May");
break;
case 6:
System.out.println("june");
break;
case 7:
System.out.println("july");
break;
default:
System.out.println("Invalid Number");
}
}
}