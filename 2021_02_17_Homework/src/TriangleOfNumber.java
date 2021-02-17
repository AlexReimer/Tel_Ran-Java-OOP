public class TriangleOfNumber {
    public static void main(String[] args) {
        //Треугольник из чисел
        int height = 6;
        int count = 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
