package tp.java.garage.domain;

import tp.java.garage.caract.Moteur;
import tp.java.garage.caract.Option;
import tp.java.garage.caract.Prix;

import static java.lang.StrictMath.floor;

/**
 * Moto : classe décrivant une moto
 * Hétite de le classe Véhicule
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Moto extends Vehicule{
    //Cylindrée
    private int cylindree;

    //********************CONSTRUCTEUR********************//
    /*
    * Constructeur avec paramètres
    */
    public Moto(String pNom, Prix pPrix, String pMarque, Moteur pMoteur, Option pOption, int pCylindree) {
        super(pNom, pPrix, pMarque, pMoteur, pOption);
        cylindree = pCylindree;
    }

    //********************METHODES********************//
    /**
     * Objectif : Calcul de la taxe
     *
     * @return : taxe calculée
     */
    @Override
    public double CalculTaxe(){
        double resultat = cylindree * 0.3;
        return floor(resultat);
    }
}
