import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorAppl {
    public static void main(String[] args) {
        int inputX;
        int inputY;
        int mathOP;

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter first number: ");
        inputX = inputNumber.nextInt();
        System.out.println("Enter second number: ");
        inputY = inputNumber.nextInt();

        Scanner operationMath = new Scanner(System.in);
        System.out.println("Choose math operation: 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division");
        mathOP = operationMath.nextInt();

        try {
            Integer number = inputNumber.nextInt();
        }catch (InputMismatchException e){
            System.out.println("It´not number, enter number");
        }
        System.out.println("End of program, try again");

        try {
            Integer number = operationMath.nextInt();
        }catch (ArithmeticException e){
            System.out.println("You tried divide by zero");
        }
        System.out.println("End of program, try again");


        switch (mathOP){
            case 1:
                System.out.println(addingNumber(inputX, inputY));
                break;
            case 2:
                System.out.println(substractNumber(inputX, inputY));
                break;
            case 3:
                System.out.println(multNumber(inputX, inputY));
                break;
            case 4:
                System.out.println(divNumber(inputX, inputY));
                break;
            default:
                System.out.println("Choose legal operation: 1,2,3 or 4");
        }

    }

    public static int addingNumber(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int substractNumber(int x, int y) {
        int difference = x - y;
        return difference;
    }

    public static int multNumber(int x, int y) {
        int product = x * y;
        return product;
    }

    public static int divNumber(int x, int y) {
        int quotient = x / y;
        return quotient;
    }


}
