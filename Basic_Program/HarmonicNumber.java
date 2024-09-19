import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        double harmonicNumber = 0.0;
        if(number>0)
        {
            for(int i=1; i<=number; i++){
                harmonicNumber = harmonicNumber+1.0/i;
            }
        }
        else{
            System.out.println("Enter valid number!!! Number must be greater than 0");
            return;
        }

        System.out.println("The "+number+"th Harmonic Number is: "+harmonicNumber);

    }
}
