public class CalculatorApplCW {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }

        System.out.println("sum res = " + (a + b));
        System.out.println("def res = " + (a - b));
        System.out.println("mult res = " + (a * b));
        try {
            System.out.println("div res = " + (a / b));
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
    }
}
