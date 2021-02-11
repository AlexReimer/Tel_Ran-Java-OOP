public class CommonDivisor {

    public static void main(String[] args) {
        //Метод принимает два числа. И надо найти нод.
        //НОД — это наибольший общий делитель. Greatest common divisor
        // Пример: для чисел 54 и 24 наибольший общий делитель равен 6.

        System.out.println(findGreatestCommonDivisor(12, 9));//-->3
        System.out.println(findGreatestCommonDivisor(54, 24));//-->6
    }

    public static int findGreatestCommonDivisor(int m, int n) {
        int tmp;
        //базовый случай
        if (m <= 0 || n <= 0) return 0;
        //решение
        do {
            tmp = m % n;
            m = n;
            n = tmp;
        } while (n != 0);
        return (m);

    }
}
