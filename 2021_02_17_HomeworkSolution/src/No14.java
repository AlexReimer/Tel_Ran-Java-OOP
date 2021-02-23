
public class No14 {
    private static boolean containsNum(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean no14(int[] input) {
        boolean containsOne = containsNum(input, 1);
        boolean containsFour = containsNum(input, 4);
        boolean result = !(containsOne && containsFour);
        return result;
    }


}
