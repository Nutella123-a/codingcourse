import java.util.Scanner;

public class re2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int firstNumber = 0;



        int value = 1;
        while (firstNumber != -999 ) {

            System.out.println("first number: ");
            firstNumber = input.nextInt();
            System.out.println("second number: ");
            int secondNumber = input.nextInt();

            value = firstNumber * secondNumber;
            System.out.println(value);
        }

    }
}
