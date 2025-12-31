
public class VoitureCarburant extends Voiture {

    private String typeCarburant;

    public VoitureCarburant(int puissance, String typeCarburant) {
        super(puissance, "Carburant");
        this.typeCarburant = typeCarburant;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Carburant : " + typeCarburant);
    }
}
