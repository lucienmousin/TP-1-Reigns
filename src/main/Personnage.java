package main;

public class Personnage {
    protected String nom;
    protected Genre genre;
    protected Jauge jaugeClerge, jaugePeuple, jaugeArmee, jaugeFinance;

    public Personnage(String nom, Genre genre) {
        this.nom = nom;
        this.genre = genre;
        this.initJauges();
    }

    public void initJauges(){
        // Initialisation des jauges entre 15 et 35 points
        jaugeClerge = new Jauge("Clergé", 15 + (int)(Math.random() * (35 - 15)));
        jaugePeuple = new Jauge("Peuple", 15 + (int)(Math.random() * (35 - 15)));
        jaugeArmee = new Jauge("Armée", 15 + (int)(Math.random() * (35 - 15)));
        jaugeFinance = new Jauge("Finances", 15 + (int)(Math.random() * (35 - 15)));
    }

    public void AfficheJauges() {
        jaugeClerge.afficheJauge();
        jaugePeuple.afficheJauge();
        jaugeArmee.afficheJauge();
        jaugeFinance.afficheJauge();
        System.out.println();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Jauge getJauge(TypeJauge type){
        switch (type){
            case CLERGE:
                return jaugeClerge;
            case PEUPLE:
                return jaugePeuple;
            case ARMEE:
                return jaugeArmee;
            case FINANCE:
                return jaugeFinance;
            default:
                return null;
        }
    }

    public void setJauge(TypeJauge type, Jauge jauge){
        switch (type){
            case CLERGE:
                this.jaugeClerge = jauge;
            case PEUPLE:
                this.jaugePeuple = jauge;
            case ARMEE:
                this.jaugeArmee = jauge;
            case FINANCE:
                this.jaugeFinance = jauge;
        }
    }


}
