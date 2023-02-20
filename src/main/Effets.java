package main;

import java.util.Map;
import java.util.TreeMap;

public class Effets {
    protected String intitule;
    protected Map<TypeJauge , Integer> effets;

    public Effets(String intitule) {
        this.intitule = intitule;
        this.effets = new TreeMap<>();

    }

    public String afficheEffets() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<TypeJauge, Integer> effet : effets.entrySet()) {
            result.append("; jauge ").append(effet.getKey()).append(":");
            int valueEffet = effet.getValue();
            if (valueEffet > 0) {
                result.append("+");
            }
            result.append(valueEffet);
        }
        return result.toString();
    }

    public void appliqueEffets(Personnage personnage){
        for(Map.Entry<TypeJauge,Integer> effet : effets.entrySet()){
            switch (effet.getKey()) {
                case ARMEE ->
                        personnage.getJauge(TypeJauge.ARMEE).setValeur(personnage.getJauge(TypeJauge.ARMEE).getValeur()
                                + effet.getValue());
                case CLERGE -> personnage.getJauge(TypeJauge.CLERGE).setValeur(
                        personnage.getJauge(TypeJauge.CLERGE).getValeur()
                                + effet.getValue());
                case FINANCE -> personnage.getJauge(TypeJauge.FINANCE).setValeur(
                        personnage.getJauge(TypeJauge.FINANCE).getValeur()
                                + effet.getValue());
                case PEUPLE -> personnage.getJauge(TypeJauge.PEUPLE).setValeur(
                        personnage.getJauge(TypeJauge.PEUPLE).getValeur()
                                + effet.getValue());
            }
        }
    }

    public void ajouteEffet(TypeJauge jauge, int valeur){
        effets.put(jauge,valeur);
    }
}
