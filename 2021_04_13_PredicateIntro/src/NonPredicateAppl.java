import java.util.Arrays;

public class NonPredicateAppl {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] oddArray = getOddNumbers(array);
        int[] evenArray = getEvenNumbers(array);
        int[] threeArray = getDivider3Numbers(array);

        displayArray("Odd numbers", oddArray);
        displayArray("Even numbers", evenArray);
        displayArray("Three numbers", threeArray);
    }

    private static int[] getDivider3Numbers(int[] array) {
        int size = countThreeNumbers(array);
        int[] res = new int[size];
        if (size == 0)
            return res;
        int index = 0;
        for (int num : array) {
            if (num % 3 == 0)
                res[index++] = 0;
        }
        return res;
    }

    private static int countThreeNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 3 == 0)
                count++;
        }
        return count;
    }

    private static int[] getEvenNumbers(int[] array) {
        int size = countEvenNumbers(array);
        int[] res = new int[size];
        if (size == 0)
            return res;
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0)
                res[index++] = num;
        }
        return res;
    }

    private static int countEvenNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0)
                count++;
        }
        return count;
    }

    private static int[] getOddNumbers(int[] array) {
        int size = countOddNumbers(array);
        int[] res = new int[size];
        if (size == 0) return res;
        int index = 0;
        for (int num : array) {
            if (num % 2 != 0) res[index] = num;
        }
        return res;
    }

    private static int countOddNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0)
                count++;
        }
        return count;
    }

    private static void displayArray(String title, int[] array) {
        System.out.println(title);
        System.out.println(Arrays.toString(array));
        System.out.println("=============================================");

    }
}
