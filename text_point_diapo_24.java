public class TestPoint {

    public static void main(String[] arguments) {

        Point p1 = new Point(3, 1);
        Point p2 = new Point();
        Point p3 = new Point(p1);

        System.out.print("P2 : ");
        p2.afficher();

        System.out.print("P3 avant déplacement : ");
        p3.afficher();

        System.out.println("Distance entre P1 et P2 : " + p1.distance(p2));

        p3.deplacer(-3, -2);

        System.out.print("P3 après déplacement : ");
        p3.afficher();
    }
}
