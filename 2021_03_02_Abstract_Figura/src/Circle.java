public class Circle extends Figura{
    double length;
    double radius;
    double square;



    @Override
    void findPeriMeter(double radius) {
        this.length = 2*Math.PI * radius;
    }

    @Override
    void findPeriMeter() {

    }

    @Override
    void findSquare() {
        this.square=Math.PI * radius *radius;
    }
}
