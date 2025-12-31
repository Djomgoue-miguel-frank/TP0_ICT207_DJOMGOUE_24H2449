public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public void afficher() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }

    public double distance(Point p) {
        return Math.sqrt((this.x - p.x) * (this.x - p.x)
                       + (this.y - p.y) * (this.y - p.y));
    }

    public void deplacer(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
}
