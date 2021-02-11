public class CommonMultiple {

    public static void main(String[] args) {
       /* метод принимает два числа и находит НОК
        НОК — это наименьшее общее кратное.
        Least common multiple - есть наименьшее натуральное число,
        которое делится на m и n без остатка, то есть кратно им обоим.
        Пример: НОК (16,20)=80
        */
        System.out.println(findLeastCommonMultiple(16, 20));

    }

    private static int findLeastCommonMultiple(int m, int n) {
        //базовый случай
        if (m <= 0 || n <= 0) return 0;
        return (m * n / CommonDivisor.findGreatestCommonDivisor(16, 20));
    }
}


