package tp.java.garage.domain;

import tp.java.garage.caract.Moteur;
import tp.java.garage.caract.Option;
import tp.java.garage.caract.Prix;

import java.util.ArrayList;
import java.util.List;

/**
 * Vehicule : classe abstraite décrivant un véhicule
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public abstract class Vehicule implements TaxeInt {
    //Nom du véhicule
    protected String nom;

    //Prix du véhicule
    protected Prix prix;

    //Marque du véhicule
    protected String marque;

    //Moteur du véhicule
    protected Moteur moteur;

    //Option du véhicule
    protected Option option;

    //liste d'options
    private List<Option> listeOptions= new ArrayList<Option>();

    //liste de prix
    private List<Prix> listePrix = new ArrayList<Prix>();

    //********************CONSTRUCTEUR********************//
    /*
    * Constructeur avec paramètres
    */
    public Vehicule(String pNom, Prix pPrix, String pMarque, Moteur pMoteur, Option pOption) {
        nom = pNom;
        prix = pPrix;
        marque = pMarque;
        moteur = pMoteur;
        option = pOption;
    }
    //********************GETTEUR********************//
    public String getNom() {
        return nom;
    }

    public Prix getPrix() {
        return prix;
    }

    public String getMarque() {
        return marque;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public Option getOption() {
        return option;
    }

    //********************METHODES********************//
    /**
     * Objectif : afficher les informations du véhicule
     *
     * @return : informations sur le véhicule
     */
    public String toString(){
        return "Le véhicule " + nom + " est de marque " + marque + ". " + "\n"
                + "Il coute " + prix.toString() + ". " + "\n"
                + moteur.toString() + ". " + "\n"
                + option.toString() + ". " + "\n";
    }

    /**
     * Objectif : ajout d'une option à la liste
     */
    public void AjoutOption(String nomOption, Prix prixOption){
        Option newOption = new Option(nomOption, prixOption);
        listeOptions.add(newOption);
    }

    /**
     * Objectif : afficher la liste des options
     *
     * @return : liste des options
     */
    public String affOptions() {
        String lignes="";
        for(Option option: listeOptions) {
            lignes=lignes+option.toString() + "\n";
        }
        return "Liste des options : \n" + lignes;
    }
}

