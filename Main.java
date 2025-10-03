public class Main {
    public static void main(String[] args) {

        Gaulois asterix = new Gaulois("Asterix", 8);
        Gaulois obelix = new Gaulois("Obelix",16);
        Romain minus = new Romain("Minus", 5);
        

        asterix.parler("Bonjour Obelix !");
        obelix.parler("Bonjour asterix , ca te dirais d'aller chasser les sangliers?");
        asterix.parler("oui tres bonne idee");
    }
}