import java.util.Arrays;

public class ComplexityAppl {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 17, 0};
        //O(1)
        double mid = (arr[0] + arr[arr.length - 1]) / 2.;
        //O(n)
        int sum = 0;
        for(int num :arr) {
            sum += num;
        }
        //O(log(n)) binary search
        int index = Arrays.binarySearch(arr,17);

        //O(n^2) bouble sort and other sorts (loop in loop)
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        //O(n^log(n)) - быстрая сортировка
        Arrays.sort(arr);
    }
}
