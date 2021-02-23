import java.util.Arrays;

public class Snowflake_Solution {
    public static void main(String[] args) {

        //    winter(10);
        String[][] snowflacke = winter(10);
        myPrint(snowflacke);
    }

    private static void myPrint(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    private static String[][] winter(int size) {
        String[][] output;
        if (size % 2 == 0) {
            output = new String[size + 1][size + 1];
        } else {
            output = new String[size][size];
        }
        //solution
        fillArray(output, 'X');

        return output;
    }

    private static void fillArray(String[][] input, char element) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                input[i][j] = " ";
            }
        }
        for (int i = 0; i < input.length; i++) {
            input[i][input.length / 2] = String.valueOf(element);
        }
        for (int i = 0; i < input.length; i++) {
            input[input.length / 2][i] = String.valueOf(element);
        }
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (i == j) {
                    input[i][j] = String.valueOf(element);
                }
            }
        }
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (i + j == input.length - 1) {
                    input[i][j] = String.valueOf(element);
                }
            }
        }
    }
}
