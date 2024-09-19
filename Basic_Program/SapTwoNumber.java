public class SapTwoNumber {
    public static void main(String[] args) {
        int firstNum = 10;
        int secondNum = 20;

        System.out.println("Before Swapping: \nFirst Number: "+firstNum+"\nSecond Number: "+secondNum);

        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;

        System.out.println("After Swapping: \nFirst Number: "+firstNum+"\nSecond Number: "+secondNum);
    }
}
