package tp.java.garage.caract;

/**
 * Prix : classe décrivant un prix
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Prix {
    //Montant
    private double montant;

    //Devise
    private TypeDevise devise;

    //********************CONSTRUCTEUR********************//
    /*
    * Constructeur avec paramètres
    */
    public Prix(double pMontant, TypeDevise pDevise) {
        montant = pMontant;
        devise = pDevise;
    }

    //********************METHODES********************//
    /**
     * Objectif : afficher le montant et la devise
     *
     * @return : montant et devise
     */
    @Override
    public String toString() {
        return montant + " " + devise;
    }
}
