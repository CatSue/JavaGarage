package tp.java.garage.launch;

import tp.java.garage.caract.*;
import tp.java.garage.domain.Camion;
import tp.java.garage.domain.Garage;
import tp.java.garage.domain.Moto;
import tp.java.garage.domain.Voiture;

public class Main {

    public static void main(String[] args) {

        Garage monGarage = new Garage();

        Prix prixNull = new Prix(0, TypeDevise.EUROS);
        Prix prix500 = new Prix(500, TypeDevise.EUROS);
        Prix prix9000 = new Prix(9000, TypeDevise.DOLLARS);
        Prix prix30000 = new Prix(30000, TypeDevise.EUROS);
        Prix prix45000 = new Prix(45000, TypeDevise.EUROS);

        Moteur moteur1 = new Moteur(TypeMoteur.DIESEL, 114);
        Moteur moteurCam = new Moteur(TypeMoteur.DIESEL, 146);
        Moteur moteurMot = new Moteur(TypeMoteur.ESSENCE,9);
        Option noOption = new Option("Pas d'option", prixNull);
        Option media = new Option ("Pack media", prix500);
        Option couleurBleu = new Option ("Couleur Bleu Fonte", prix500);

        Voiture voiture1 = new Voiture("Trafic", prix30000, "Renault", moteur1, media,5, 4, 6,3.2);
        Camion camion1 = new Camion("Daily",prix45000,"Iveco", moteurCam, couleurBleu, 3,9, 1105);
        Moto moto1 = new Moto ("FZ II FZ1",prix9000, "Yamaha", moteurMot, noOption,1000);

        monGarage.AddVehicule(voiture1);
        monGarage.AddVehicule(camion1);
        monGarage.AddVehicule(moto1);

        monGarage.EcrireDansUnFichier(Constant.CHEMIN_FICHIER, voiture1.toString());
        monGarage.EcrireDansUnFichier(Constant.CHEMIN_FICHIER, camion1.toString());
        monGarage.EcrireDansUnFichier(Constant.CHEMIN_FICHIER, moto1.toString());

        //System.out.println("Taxe de : " + camion1.CalculTaxe() + " €");
        //moto1.AjoutOption("Couleur noir brillant", prix500);
        //moto1.AjoutOption("Peinture sur-mesure", prix500);
        //moto1.AjoutOption("GPS",prix300);
        //System.out.println(moto1.affOptions());
    }
}
