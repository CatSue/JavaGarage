package tp.java.garage.domain;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Garage : classe modélisant un garage
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Garage {
    //Liste de véhicules
    private List<Vehicule> listVehicules = new ArrayList<>();

    //********************CONSTRUCTEUR********************//
    public Garage() {
    }

    //********************METHODES********************//
    /**
     * Objectif : ajout d'un véhicule à la liste
     */
    public void AddVehicule(Vehicule newVehicule){
        listVehicules.add(newVehicule);
    }

    /**
     * Objectif : afficher la liste des véhicules
     *
     * @return : liste des véhicules
     */
    public String affVehicules() {
        String lignes="";
        for(Vehicule vehicule: listVehicules) {
            lignes=lignes+vehicule.toString() + "\n";
        }
        return "Liste des vehicules : \n" + lignes;
    }

    /**
     * Objectif : écrire dans un fichier
     *
     * @param pCheminFichier : chemin vers le fichier
     * @param pLigne : ligne à écrire
     */
    public static void EcrireDansUnFichier(String pCheminFichier, String pLigne){
        try{
            File file = new File(pCheminFichier);
            //si fichier n'existe pas, le créer
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(pLigne);
            bw.newLine();
            bw.close();
        }
        catch (IOException e){
            //Message à afficher en cas d'erreur d'écriture dans le fichier
            System.out.println("Un probleme est survenu lors de l'écriture des données dans le fichier" + e);
        }
    }
}
