package tp.java.garage.caract;

/**
 * Moteur : classe décrivant un moteur
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Moteur {
    //Type du moteur
    private TypeMoteur type;

    //Puissance
    private double puissance;

    //********************CONSTRUCTEUR********************//
    /*
    * Constructeur avec paramètres
    */
    public Moteur(TypeMoteur pType, double pPuissance) {
        type = pType;
        puissance = pPuissance;
    }

    //********************GETTEURS********************//
    public TypeMoteur getType() {
        return type;
    }

    public double getPuissance() {
        return puissance;
    }

    //********************METHODES********************//
    /**
     * Objectif : afficher les informations du moteur
     *
     * @return : informations sur le moteur
     */
    @Override
    public String toString() {
        return  "Moteur de type " + type + ", puissance de " + puissance + " ch" ;
    }
}
