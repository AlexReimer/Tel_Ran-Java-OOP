import java.util.Arrays;

public class HW_Exercise {
    public static void main(String[] args) {
        //Given an array of ints, return true if the array contains no 1’s and no 3’s.
        int[] arr1 = new int[]{0, 2, 4};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{1, 2, 4};
        System.out.println(lucky13(arr1));// →true
        System.out.println(lucky13(arr2));// →false
        System.out.println(lucky13(arr3));// →false

        System.out.println("-------");

        /*Given a number n, create and return a new int array of length n,
        containing the numbers 0, 1, 2, … n-1. The given n may be 0,
        in which case just return a length 0 array.
        You do not need a separate if-statement for the length-0 case;
        the for-loop should naturally execute 0 times in that case, so it just works.
        The syntax to make a new int array is: new int[desired_length] (See also: FizzBuzz Code)
         */
        System.out.println(Arrays.toString(fizzArray(4)));//→ [0, 1, 2, 3]
        System.out.println(Arrays.toString(fizzArray(1)));// → [0]
        System.out.println(Arrays.toString(fizzArray(10)));// → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println("-------");

        //Given an array of ints, return true if it contains no 1’s or it contains no 4’s.
        int[] arr7 = new int[]{1, 2, 4};
        int[] arr8 = new int[]{1, 2, 3, 4};
        int[] arr9 = new int[]{5, 3, 6};
        System.out.println(no14(arr7));//  → true
        System.out.println(no14(arr8));// → false
        System.out.println(no14(arr9));// → true

    }

    private static boolean no14(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 && array[i] == 4) return true;
        }
        return false;
    }

    private static int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    private static boolean lucky13(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1 || input[i] == 3) return false;
        }
        return true;
    }
}


