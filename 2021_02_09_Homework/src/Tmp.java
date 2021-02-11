import java.util.Arrays;
import java.util.Random;


public class Tmp {
    public static void main(String[] args) {
        // Создать массив с десятичными дробями.
        double [] arr = createRandomDoubleArray (10);
        // Вывести его на экран.
        System.out.println(Arrays.toString(arr));
        bubbleSortDoubleArray(arr);
        System.out.println(Arrays.toString(addElementDoubleArray(5, arr, 3.14)));
        System.out.println(Arrays.toString(deleteElementDoubleArray(arr, 3)));
        System.out.println(Arrays.toString(updateElementDoubleArray(arr, 2, 7.77)));
        System.out.println(Arrays.toString (fillArray(arr)));

    }

    private static double[] createRandomDoubleArray(int size) {
        Random rand = new Random();
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble();
        }
        return arr;
    }

    //Отсортировать его по возрастанию.
    public static double[] bubbleSortDoubleArray(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    double tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        for (double sorted : arr) {
            System.out.println(sorted);
        }
        return arr;
    }

    //Добавить один элемент в массив.
    public static double[] addElementDoubleArray(int index, double[] arr, double newElement) {
        double[] newArr = new double[arr.length + 1];
        for (int i = 0; i < index + 1; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = newElement;
        for (int i = index + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }

    //Удалить один элемент из массива
    public static double[] deleteElementDoubleArray(double[] arr, int index) {
        double[] newArr = new double[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index + 1; i <= newArr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        return newArr;
    }

    //Изменить один элемент в массиве
    public static double[] updateElementDoubleArray(double[] arr, int index, double updateElement) {
        double update = updateElement;
        for (int i = 0; i < index; i++) {
            arr[index] = update;
        }
        return arr;
    }

    //Перезаписать/заполнить все элементы массива новыми значениями
    public static double[] fillArray(double[] arr) {
        double[] refillArray = createRandomDoubleArray (arr.length);
        return refillArray;
    }
}
