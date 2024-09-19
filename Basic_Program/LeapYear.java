import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter 4 digit year: 2008");
        int EnterYear = sc.nextInt();
        if(EnterYear>1000 && EnterYear<9999)
        {
            if((EnterYear%4==0 && EnterYear%100!=0) || EnterYear%400==0)
                System.out.println("Year "+EnterYear+" is leap year");
            else
                System.out.println("year "+EnterYear+" is not a leap year");
        }
        else
            System.out.println("Invalid input. Please enter a 4-digit year: ");


    }
}
