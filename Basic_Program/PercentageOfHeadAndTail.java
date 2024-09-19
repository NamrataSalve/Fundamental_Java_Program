import java.util.Scanner;

public class PercentageOfHeadAndTail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = scanner.nextInt();

        if (numFlips <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < numFlips; i++) {
            if (Math.random() < 0.5) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }

        double headsPercentage = ((double) headsCount / numFlips) * 100;
        double tailsPercentage = ((double) tailsCount / numFlips) * 100;

        System.out.println("Heads: " + headsCount + " (" + headsPercentage + "%)");
        System.out.println("Tails: " + tailsCount + " (" + tailsPercentage + "%)");
    }
}
