public class Voiture {

    private int puissance;
    private boolean estDemarree;
    private double vitesse;

    // Constructeur
    public Voiture(int puissance) {
        this.puissance = puissance;
        this.estDemarree = false;
        this.vitesse = 0.0;
    }

    public int getPuissance() {
        return puissance;
    }

    public void demarrer() {
        estDemarree = true;
    }

    public void accelerer(double v) {
        if (estDemarree && v > 0) {
            vitesse += v;
        }
    }

    public double getVitesse() {
        return vitesse;
    }
}
