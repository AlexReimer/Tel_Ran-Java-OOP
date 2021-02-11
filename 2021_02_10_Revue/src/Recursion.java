public class Recursion {
    public static void main(String[] args) {
        myFactorial(10);
        System.out.println(myFactorialRecursion(6));
    }

//рекурсия
    private static int myFactorialRecursion(int number) {
        //Условия вызода, базовый случай
        // нумбер ) нумбер -1 => нумбер - 1 = (нумбер - 1)
        if (number <=1) {
            return 1;
        }else {
            return number * myFactorialRecursion(number-1);
        }
    }

    //не рекурсия
    private static int myFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

}
