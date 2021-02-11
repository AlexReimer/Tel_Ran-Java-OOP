public class ExampleDivideWithOutDivide {
    public static void main(String[] args) {
        solve(10, 2); // 5
    }

    private static void solve(int a, int b) {
        int count = 0;
        while (a > 0) {
            a = a - b;
            count++;
        }
        System.out.println(count);
    }
}
