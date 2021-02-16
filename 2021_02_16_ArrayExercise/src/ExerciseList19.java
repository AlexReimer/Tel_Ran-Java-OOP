public class ExerciseList19 {
/* Return the number of even ints in the given array.
Note: the % “mod” operator computes the remainder, e.g. 5 % 2 is 1.
 countEvens([2, 1, 2, 3, 4]) → 3
        countEvens([2, 2, 0]) → 3
        countEvens([1, 3, 5]) → 0
*/

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 1, 2, 3, 4};
        int[] arr2 = new int[]{2, 2, 0};
        int[] arr3 = new int[]{1, 3, 5};

        System.out.println(countEvens(arr1));//3
        System.out.println(countEvens(arr2));//3
        System.out.println(countEvens(arr3));//0
        System.out.println("====");

        int[] arr4 = new int[]{1, 2, 2, 1};
        int[] arr5 = new int[]{1, 1};
        int[] arr6 = new int[]{1, 2, 2, 1, 13};
        int[] arr7 = new int[]{};
        int[] arr8 = new int[]{1, 2, 3, 4, 5, 13, 14, 15, 16};
        int[] arr9 = new int[0];
        int[] arr10 = new int[]{20, 4, 5, 13, 14, 15, 16};

        System.out.println(sum13(arr4));// →6
        System.out.println(sum13(arr5));// →2
        System.out.println(sum13(arr6));// →6
        System.out.println(sum13(arr7));// →0
        System.out.println(sum13(arr8));// →15
        System.out.println(sum13(arr9));// →0
        System.out.println(sum13(arr10));// →29

    }

    private static int sum13(int[] input) {
        int sum=0;
        for (int i = 0; i < input.length; i++) {
            if(input[i]==13){
                break;
            }
            sum=sum+input[i];
        }
        return sum;
    }

    private static int countEvens(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
