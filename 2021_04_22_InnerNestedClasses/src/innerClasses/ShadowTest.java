package innerClasses;

public class ShadowTest {
    public int x = 0;
    public int y = 100500;

    class FirstLevel {
        public int x = 1;

        void methodInFirtsLevel(int x) {
            System.out.println("x= " + x);
            System.out.println("this x = " + this.x);
            System.out.println("ShadowTesz this x = " + ShadowTest.this.x);
            System.out.println("ShadowTest y = " + y);
        }
    }
}
