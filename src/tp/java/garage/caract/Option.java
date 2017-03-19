package tp.java.garage.caract;

/**
 * Option : classe décrivant une option
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Option {
    //Nom de l'option
    private String nom;

    //Prix de l'option
    private Prix prix;

    //********************CONSTRUCTEUR********************//
    /*
    * Constructeur avec paramètres
    */
    public Option(String pNom, Prix pPrix) {
        nom = pNom;
        prix = pPrix;
    }

    //********************GETTEURS********************//
    public String getNom() {
        return nom;
    }

    public Prix getPrix() {
        return prix;
    }

    //********************METHODES********************//
    /**
     * Objectif : afficher les informations de l'option
     *
     * @return : informations sur l'option
     */
    @Override
    public String toString() {
        return  "Option " + nom + " : " + prix.toString() ;
    }
}
