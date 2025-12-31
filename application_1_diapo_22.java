public class Point {

    private double x;
    private double y;

    public Point(double a, double b) {
        x = a;
        y = b;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public void deplacer(double dx, double dy) {
        x += dx;
        y += dy;
    }
}
