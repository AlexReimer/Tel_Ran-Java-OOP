public class ArrayAppl {
    public static void main(String[] args) {
        int[] ar = new int[10];
        System.out.println(ar[0]);//->default 0
        double[] ar2 = new double[10];
        System.out.println(ar2[9]);//-> default 0.0
        boolean[] ar3 = new boolean[10];
        System.out.println(ar3[0]);//-> default false
        String[] ar4 = new String[10];
        System.out.println(ar4[0]);//-> default null
        ar[0] = 100;
        System.out.println(ar[0]);//->100
        //===================================
        int[] ar5 = {1, 2, 3, 4, 5, 6};
        //===================================
        for (int i = 0; i < ar5.length; i++) {
            System.out.println(ar5[i] + " ");
        }
        System.out.println();
        for (int i = ar5.length - 1; i >= 0; i--) {
            System.out.println(ar5[i] + " ");
        }
        System.out.println();
        //===================================
        int[] test = {9, 2, 8, 1, 7, 5, 3};
        printEvenValue(test);
        int sum = (int) getSumAllEllements(test);
        System.out.println(sum);
        int startIndex = 1, endIndex = 5;
        sum = (int) getSumOddElementInRange(test, startIndex, endIndex);
        System.out.println(sum);
        String[] strAr = {"123", "22", "10", "12", "3.14"};
        Double sumD = getSumNumbersFromStringArray(strAr);
        System.out.print(sum);
        reverseArray(strAr);
        //===================================
        int[] test2 = {-9, -2, 8, 1, -7, 5, 3, -12};
        //искомое: сумма двух положительных элементов -
        // первый с начала и перовый с конца -> 8+3=11
        int res = getSumFirstPostLastPos(test2);
        System.out.println(res);
        int res2 = getSumFirstPostLastPos2(test2);
        System.out.println(res2);
    }

    private static int getSumFirstPostLastPos2(int[] test) {
        //flag используем - 2 перемнных для начала с отр. значениями
        int firstPositiv = -1, lastPositiv = -1;
        for (int i = 0, j = test.length - 1; i < test.length; i++, j--) {
            if (test[i] >= 0) {
                if (firstPositiv == -1) firstPositiv = test[i];
            }
            if (test[j] >= 0) {
                if (lastPositiv == -1) lastPositiv = test[j];
            }
            if (firstPositiv != -1 && lastPositiv != -1) return firstPositiv;
        }
        return -1; // код ошибки, если выше не сработает
    }

    private static int getSumFirstPostLastPos(int[] test) {
        //flag используем - 2 перемнных для начала с отр. значениями
        int firstPositiv = -1, lastPositiv = -1;
        for (int i = 0; i < test.length; i++) {
            if ((test[i] >= 0)) {
                if (firstPositiv == -1) firstPositiv = test[i]; //проверка и запись

                //lastPositiv будет переинициализоваться каждый раз до
                // тех пор пока последний положительный эл. рне встретиться
                lastPositiv = test[i];
            }

        }
        return firstPositiv + lastPositiv;
    }


    // "123", "22", "10", "12", "3.14" -> "3.14", "12", "10",  "22", "123"
    private static void reverseArray(String[] array) {
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

    }

    private static double getSumNumbersFromStringArray(String[] strAr) {
        double sum = 0;
        for (int i = 0; i < strAr.length; i++) {
            sum += Double.parseDouble(strAr[i]);

        }
        return sum;
    }

    private static long getSumOddElementInRange(int[] test, int startIndex, int endIndex) {
        long sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            if (test[i] % 2 != 0) sum += test[i];
        }
        return sum;
    }

    private static long getSumAllEllements(int[] test) {
        long sum = 0; //если сумму интов выйдет ща пределы, создаем на всякий случай переменную long
        for (int i = 0; i < test.length; i++) {
            sum += test[i];
        }
        return sum;
    }

    private static void printEvenValue(int[] test) {
        for (int i = 0; i < test.length; i++) { //i < test.length == i <= test.length-1
            if (test[i] % 2 == 0) System.out.println(test[i] + " ");
        }
        System.out.println();
    }
}
