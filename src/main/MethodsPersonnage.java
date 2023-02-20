package main;

public class MethodsPersonnage extends Personnage{
    /**
     * Crée un nouveau personnage avec le nom et le genre spécifiés,
     * puis initialise les jauges de Clergé, Peuple, Armée et Finances.
     *
     * @param nom   Le nom du personnage
     * @param genre Le genre du personnage
     */
    public MethodsPersonnage(String nom, Genre genre) {
        super(nom, genre);
    }


    /**
     * Retourne le nom du personnage
     * @return le nom du personnage
     */
    public static String getNom() {
        return nom;
    }
    /**
     * Modifie le nom du personnage
     * @param nom Le nouveau nom du personnage
     */
    public void setNom(String nom) {
        Personnage.nom = nom;
    }



    /**
     * Retourne le genre du personnage
     * @return le genre du personnage
     */
    public static Genre getGenre() {
        return genre;
    }
    /**
     * Modifie le genre du personnage
     * @param genre Le nouveau genre du personnage
     */
    public void setGenre(Genre genre) {
        Personnage.genre = genre;
    }




    /**
     * Retourne la jauge du clergé
     * @return la jauge du clergé
     */
    public static Jauge getJaugeClerge() {
        return jaugeClerge;
    }
    /**
     * Modifie la jauge du clergé
     * @param jaugeClerge La nouvelle jauge du clergé
     */
    public void setJaugeClerge(Jauge jaugeClerge) {
        Personnage.jaugeClerge = jaugeClerge;
    }




    /**
     * Retourne la jauge du peuple
     * @return la jauge du peuple
     */
    public static Jauge getJaugePeuple() {
        return jaugePeuple;
    }
    /**
     * Modifie la jauge du peuple
     * @param jaugePeuple La nouvelle jauge du peuple
     */
    public void setJaugePeuple(Jauge jaugePeuple) {
        Personnage.jaugePeuple = jaugePeuple;
    }




    /**
     * Retourne la jauge de l'armée
     * @return la jauge de l'armée
     */
    public static Jauge getJaugeArmee() {
        return jaugeArmee;
    }
    /**
     * Modifie la jauge de l'armée
     * @param jaugeArmee La nouvelle jauge de l'armée
     */
    public void setJaugeArmee(Jauge jaugeArmee) {
        Personnage.jaugeArmee = jaugeArmee;
    }




    /**
     * Retourne la jauge des finances
     * @return la jauge des finances
     */
    public static Jauge getJaugeFinance() {
        return jaugeFinance;
    }
    /**
     * Modifie la jauge des finances
     * @param jaugeFinance La nouvelle jauge des finances
     */
    public void setJaugeFinance(Jauge jaugeFinance) {
        Personnage.jaugeFinance = jaugeFinance;
    }




}
