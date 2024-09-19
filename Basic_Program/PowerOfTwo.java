import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the power value Number(0 <= number < 31): ");
        int number = scanner.nextInt();
        if (number < 0 || number >= 31) {
            System.out.println("Please enter a value for number such that 0 <= number < 31.");
            return;
        }
        System.out.println("Powers of 2 less than or equal to 2^" + number + ":");
        for (int i = 0; i <= number; i++) {
            System.out.println("2^" + i + " = " + (1 << i));
        }
        System.out.println("Enter The Any Year");
        int year = scanner.nextInt();

        if(year%4==0 && year!=100)
            System.out.println("Year is leap year");
        else if(year%400==0)
            System.out.println("Year is leap year");
        else
            System.out.println("Year is not a leap year");

    }
}
