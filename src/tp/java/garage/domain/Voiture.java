package tp.java.garage.domain;

import tp.java.garage.caract.Moteur;
import tp.java.garage.caract.Option;
import tp.java.garage.caract.Prix;

/**
 * Voiture : classe décrivant une voiture
 * Hétite de le classe Véhicule
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Voiture extends Vehicule {
    //Puissance
    private int puissance;

    //Nombre de portes
    private int nbPorte;

    //Nombre de sièges
    private int nbSiege;

    //Taille du coffre
    private double tailleCoffre;

    //********************CONSTRUCTEUR********************//
    /*
    * Constructeur avec paramètres
    */
    public Voiture(String pNom, Prix pPrix, String pMarque, Moteur pMoteur, Option pOption, int pPuissance, int pNbPorte, int pNbSiege, double pTailleCoffre) {
        super(pNom, pPrix, pMarque, pMoteur, pOption);
        puissance = pPuissance;
        nbPorte = pNbPorte;
        nbSiege = pNbSiege;
        tailleCoffre = pTailleCoffre;
    }

    //********************METHODES********************//
    /**
     * Objectif : Calcul de la taxe
     *
     * @return : taxe calculée
     */
    @Override
    public double CalculTaxe(){
        double resultat = puissance * 10;
        return resultat;
    }

}
