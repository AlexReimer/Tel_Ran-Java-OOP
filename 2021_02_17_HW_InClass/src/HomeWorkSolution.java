public class HomeWorkSolution {
    public static void main(String[] args) {
        // 1.Given an array of ints, return true if the array contains no 1’s and no 3’s.
/*        int[] arr1 = new int[]{0, 2, 4};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{1, 2, 4};
        System.out.println(lucky13(arr1)); //→true
        System.out.println(lucky13(arr2));// →false
        System.out.println(lucky13(arr3));// →false*/

/*        System.out.println(Arrays.toString(fizzArray(4)));
        System.out.println("========");
        System.out.println(Arrays.toString(fizzArray(1)));
        System.out.println("========");
        System.out.println(Arrays.toString(fizzArray(10)));
        System.out.println(Arrays.toString(fizzArray(0)));
        int[] zeroArray = new int[0];
        System.out.println("Попытка распечатки нулевого массива" + Arrays.toString(zeroArray));*/

        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 2, 3, 4};
        int[] array3 = new int[]{2, 3, 4};
        int[] array4 = new int[]{2, 3, 1, 1, 1};
        System.out.println(no14(array1));// → true
        System.out.println(no14(array2));// → false
        System.out.println(no14(array3));// → true
        System.out.println(no14(array4));// → true
    }

    private static boolean no14(int[] input) {
        boolean temp1 = false;
        boolean temp4 = false;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1) {
                temp1 = true;
            } else if (input[i] == 4) {
                temp4 = true;
            }
        }
        if (temp1 && temp4) {
            return false;
        }
        return true;
    }

    private static boolean no14second(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1) {
                for (int j = 0; j < input.length; j++) {
                    if (input[j] == 4) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static int[] fizzArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }

    private static boolean lucky13(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1 || input[i] == 3) {
                return false;
            }
        }
        return true;
    }
}
