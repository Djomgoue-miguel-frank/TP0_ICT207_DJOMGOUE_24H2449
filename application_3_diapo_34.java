public class Division {

    private double numerateur;
    private double denominateur;

    public Division(double numerateur, double denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public double diviser() {
        if (denominateur == 0) {
            System.out.println("Erreur : division par zéro impossible (instance).");
            return Double.NaN;
        }
        return numerateur / denominateur;
    }

    public static double diviser(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : division par zéro impossible (statique).");
            return Double.NaN;
        }
        return a / b;
    }
}

public class TestDivision {

    public static void main(String[] args) {

        Division d1 = new Division(10, 2);
        System.out.println("Division d'instance 10 / 2 = " + d1.diviser());

        Division d2 = new Division(5, 0);
        System.out.println("Division d'instance 5 / 0 = " + d2.diviser());

        System.out.println("Division statique 10 / 2 = " + Division.diviser(10, 2));
        System.out.println("Division statique 5 / 0 = " + Division.diviser(5, 0));
    }
}
