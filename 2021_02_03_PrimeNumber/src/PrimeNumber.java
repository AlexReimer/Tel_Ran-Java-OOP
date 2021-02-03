public class PrimeNumber {
    public static void main(String[] args) {
        //Дано число, найти все ПРОСТЫЕ ЧИСЛА меньше данного числа

        findaAllPrimeNumnern(10);
    }

    private static void findaAllPrimeNumnern(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i + " ");
            }

        }
    }

    private static boolean isPrimeNumber(int input) {
        int border = (int) Math.sqrt(input); // эта строчка сокращает работу процесора в разы
        int count = 0;
        for (int j = 2; j < border; j++) {
            if (input % j == 0) {
                return false;
            }
        }
        return true;
    }
}