public class TestPassageParametres1 {

    public static void affichageDouble(int a) {
        a = a * 2;
        System.out.println("Valeur DANS la méthode : " + a);
    }

    public static void main(String[] args) {
        int variableOriginale = 4;
        System.out.println("Valeur AVANT l'appel : " + variableOriginale);

        affichageDouble(variableOriginale);

        System.out.println("Valeur APRÈS l'appel : " + variableOriginale);
    }
}
