public class CoctailSort {
    public static void main(String[] args) {
        int[] myTestArray = new int[20];
        int[] array = createArray(10);
        myPrint(array);
        coctailSort(array);
        myPrint(array);
    }

    public static void coctailSort(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            boolean swap = false;

            //coctail Sort  первая часть - от начала в конец перемещаются "тяжелые" элементы
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swap = true;
                }
            }
            //уменьшем диапазон работы цикла на единицу
            // end - конечный индекс диапазона рассматриваего
            end--;

            //coctail Sort вторая часть - из конца в начало еремещаются "легкие" элементы
            for (int i = end; i > start; i--) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swap = true;
                }
            }
            start++;
            if (!swap){
                break;
            }
        }
    }

    public static void myPrint(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) { // здесь -1 чтобы запятая из стринга не печатлесь
            System.out.print(array[i] + ", ");
        }
        System.out.println(array [array.length - 1] + "]");
    }

    public static int[] createArray(int size) {
        int[] output = new int[size];
        for (int i = 0; i < output.length; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }
}
