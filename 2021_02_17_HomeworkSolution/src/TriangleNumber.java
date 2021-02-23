public class TriangleNumber {
    public static void main(String[] args) {

        lovelyTriangle (6);

    }

    private static void lovelyTriangle(int size) {
        int temp = 0;
        for (int i = 1; i <= size; i++) {
            for (int k = 0; k < 13 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + temp; j++) {
                System.out.print(i);
            }
            temp++;
            System.out.println();
        }
    }
}
