public class TestPassageParametres2 {

    public static void deplacerPoint(Point p, double dx, double dy) {
        p.deplacer(dx, dy);
    }

    public static void main(String[] args) {
        Point monPoint = new Point(1, 1);

        System.out.print("Point AVANT l'appel : ");
        monPoint.afficher();

        deplacerPoint(monPoint, 2, 2);

        System.out.print("Point APRÈS l'appel : ");
        monPoint.afficher();
    }
}
