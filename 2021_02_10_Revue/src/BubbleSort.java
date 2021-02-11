import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myLovelyArray = generateArray(10);
        //копируем входящий массив в новый чтобы не трогать оригинальные данные например
        int[] myCopyFromLovelyArray = copyMyArray(myLovelyArray);

        System.out.println(Arrays.toString(myLovelyArray));
        bubbSort(myLovelyArray);
        System.out.println(Arrays.toString(myLovelyArray));

        System.out.println("Копия изначального массива");
        System.out.println(Arrays.toString(myCopyFromLovelyArray));

        bubbleSortRecursion(myCopyFromLovelyArray);
        System.out.println(Arrays.toString(myCopyFromLovelyArray));

    }

    private static void bubbleSortRecursion(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input [i] > input [i +1]) {
                swap (input, i);
                count ++;
            }
        }
        if (count >0) {
            bubbleSortRecursion(input);
        }
    }

    //копируем входящий массив в новый чтобы не трогать оригинальные данные например
    private static int[] copyMyArray(int[] input) {
        int output[] = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        return output;
    }


    //еще один вариант Пузурьковой сортировки
    private static void bubbSort(int[] input) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    swap(input, i);
                    unsorted = true;
                }
            }
        }
    }

    private static void swap(int[] input, int i) {
        int temp = input[i];
        input[i] = input[i + 1];
        input[i + 1] = temp;
    }

    private static int[] generateArray(int size) {
        int[] output = new int[size];
        for (int i = 0; i < output.length; i++) {
            output[i] = randomIntGenerate();
        }
        return output;
    }

    private static int randomIntGenerate() {
        return (int) (Math.random() * 100); //такая запись генерирует числа от 0 до 100
    }
}
