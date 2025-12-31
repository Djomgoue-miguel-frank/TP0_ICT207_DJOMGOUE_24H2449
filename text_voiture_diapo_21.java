public class TestMaVoiture {

    public static void main(String[] argv) {

        Voiture maVoiture = new Voiture(7);
        Voiture maSecVoiture = new Voiture();

        System.out.println("Test de la première voiture :");
        maVoiture.demarre();
        maVoiture.accelere(50);

        System.out.println("\nTest de la seconde voiture :");
        maSecVoiture.accelere(20);
        maSecVoiture.demarre();
        maSecVoiture.accelere(30);
    }
}
