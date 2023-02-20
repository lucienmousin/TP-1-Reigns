package main;

public class Jauge {
    protected TypeJauge type;

    protected String nom;

    protected int valeur;

    public Jauge(String nom, int valeur){
        this.nom = nom;
        this.valeur = valeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        if (valeur <= 0 || valeur >= 50){
            Reigns.Fin = true;
        }
        else {
            this.valeur = valeur;
        }
    }

    public TypeJauge getType() {
        return type;
    }

    public void setType(TypeJauge type) {
        this.type = type;
    }

    public void afficheJauge() {
        String resultat = "[";
        // valeur : ####
        for(int i=0;i<valeur;i++){
            resultat += "#";
        }
        // on complète avec ____
        for(int i=0;i<50-valeur;i++){
            resultat += "_";
        }
        resultat += "] ";
        // affichage du nom
        resultat += nom;
        System.out.println(resultat);
    }
}
