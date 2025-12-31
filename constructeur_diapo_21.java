public class Voiture {

    private int puissance;
    private boolean estDemarree;
    private double vitesse;

    public Voiture() {
        puissance = 4;
        estDemarree = false;
        vitesse = 0;
    }

    public Voiture(int p) {
        puissance = p;
        estDemarree = false;
        vitesse = 0;
    }

    public void demarre() {
        estDemarree = true;
        System.out.println("La voiture a démarré.");
    }

    public void accelere(double v) {
        if (estDemarree) {
            vitesse += v;
            System.out.println("La vitesse est maintenant de : " + vitesse);
        } else {
            System.out.println("La voiture doit d'abord démarrer !");
        }
    }
}
