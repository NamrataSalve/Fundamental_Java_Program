public class MaximumAmongThree {
    public static void main(String[] args) {
        int number1=10;
        int number2=200;
        int number3=30;
         if(number1>number2 && number2>number3)
             System.out.println("Number1 is maximum");
         else if(number2>number1 && number2>number3)
             System.out.println("Number2 is maximum");
         else
             System.out.println("Number3 is maximum");
    }
}
