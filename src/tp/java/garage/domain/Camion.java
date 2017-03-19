package tp.java.garage.domain;

import tp.java.garage.caract.Moteur;
import tp.java.garage.caract.Option;
import tp.java.garage.caract.Prix;

/**
 * Camion : classe décrivant un camion
 * Hétite de le classe Véhicule
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Camion extends Vehicule {
    //Nom d'essieux
    private int nbEssieu;

    //Volume de chargement
    private double volCharg;

    //Poids de chargement
    private double poidsCharg;

    //********************CONSTRUCTEUR********************//
    /*
    * Constructeur avec paramètres
    */
    public Camion(String pNom, Prix pPrix, String pMarque, Moteur pMoteur, Option pOption, int pNbEssieu, double pVolCharg, double pPoidsCharg) {
        super(pNom, pPrix, pMarque, pMoteur, pOption);
        nbEssieu = pNbEssieu;
        volCharg = pVolCharg;
        poidsCharg = pPoidsCharg;
    }

    //********************METHODES********************//
    /**
     * Objectif : Calcul de la taxe
     *
     * @return : taxe calculée
     */
    @Override
    public double CalculTaxe(){
        double resultat = nbEssieu * 50;
        return resultat;
    }
}
