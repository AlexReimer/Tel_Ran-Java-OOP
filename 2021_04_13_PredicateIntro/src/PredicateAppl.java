import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateAppl {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] oddArray = getOddNumbers(array);
        int[] evenArray = getEvenNumbers(array);
        int[] threeArray = getDivider3Numbers(array);

        displayArray("Odd numbers", oddArray);
        displayArray("Even numbers", evenArray);
        displayArray("Three numbers", threeArray);
    }

    private static int [] getDivider3Numbers(int [] array){
        return getNumbers(array,new ThreeDividerPredicate());
    }

    private static int[] getEvenNumbers(int[] array) {
        return getNumbers(array, new EvenPredicate());
    }

    private static int[] getOddNumbers(int[] array) {
        return getNumbers(array, new OddPredicate());
    }

    private static int [] getNumbers (int[]array, Predicate<Integer> predicate){
        int size = countNumbers(array, predicate);
        int[] res = new int[size];
        if (size == 0)
            return res;
        int index = 0;
        for (int num : array) {
            if (predicate.test(num))
                res[index++] = num;
        }
        return res;
    }

    private static int countNumbers(int[] array, Predicate<Integer> predicate) {
        int count = 0;
        for (int num : array) {
            if (predicate.test(num))
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
