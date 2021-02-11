public class Rectangle {
    int x, y;
    int wigth, heighth;

    public Rectangle(int x, int y, int wigth, int heighth) {
        this.x = x;
        this.y = y;
        this.wigth = wigth;
        this.heighth = heighth;
    }

    public Rectangle(int wigth, int heighth) {
//        x=0;
//        y=0;
//        this.wigth = wigth;
//        this.heighth = heighth;
        //   new Rectangle(0,9,wigth,heighth);
        this(0, 0, wigth, heighth); //все три варианта - одно и тоже. Первый - самый простой, третий - самы совершенный
    }
}


class RectangleTest {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(500, 700);
        Rectangle secondRectangle = new Rectangle(200, 250, 400, 800);
    }
}

