public class VoitureElectrique extends Voiture {

    private String typeChargeur;

    public VoitureElectrique(int puissance, String typeChargeur) {
        super(puissance, "Electrique");
        this.typeChargeur = typeChargeur;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Chargeur : " + typeChargeur);
    }
}
