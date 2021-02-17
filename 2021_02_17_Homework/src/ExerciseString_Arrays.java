public class ExerciseString_Arrays {
    public static void main(String[] args) {

        /* Given a string and an int n, return a string made of the first
    n characters of the string, followed by the first n-1 characters of the string, and so on.
    You may assume that n is between 0 and the length of the string,
    inclusive (i.e. n >= 0 and n <= str.length()).*/
        System.out.println(repeatFront("Chocolate", 4));//→ "ChocChoChC"
        System.out.println(repeatFront("Chocolate", 3));//→ "ChoChC"
        System.out.println(repeatFront("Ice Cream", 2));//→ "IcI"

        System.out.println("------");

    /*Given an array of ints, return true if the array
    contains either 3 even or 3 odd values all next to each other. */
        int[] arr1 = new int[]{2, 1, 3, 5};
        int[] arr2 = new int[]{2, 1, 2, 5};
        int[] arr3 = new int[]{2, 4, 2, 5};
        int[] arr4 = new int[]{2, 4, 3, 5, 7, 6};
        int[] arr5 = new int[]{2, 1, 6};
        int[] arr6 = new int[]{};
        System.out.println(modThree(arr1)); //→ true
        System.out.println(modThree(arr2)); //→ false
        System.out.println(modThree(arr3)); //→ true
        System.out.println(modThree(arr4)); //→ true
        System.out.println(modThree(arr5)); //→ false
        System.out.println(modThree(arr6)); //→ false
    }

    private static boolean modThree(int[] array) {
        int countOne = 0;
        int countTwo = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOne++;
            } else {
                countTwo++;
            }
            if (countOne == 3 || countTwo == 3) return true;
        }
        return false;
    }

    private static String repeatFront(String str, int n) {
        String result = "";
        int i;
        for (i = n; i > 0; i--) {
            result += str.substring(0, i);
        }
        return result;
    }
}

