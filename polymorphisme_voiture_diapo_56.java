public class Voiture {

    protected int puissance;
    protected String type;

    public Voiture(int puissance, String type) {
        this.puissance = puissance;
        this.type = type;
    }

    public void afficher() {
        System.out.println(type);
    }
}
