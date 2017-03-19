package tp.java.garage.caract;

/**
 * TypeMoteur : énumération des différents types de moteurs
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public enum TypeMoteur {
    DIESEL("Diesel"),
    ESSENCE("Essence"),
    HYBRIDE("Hybride"),
    ELECTRIQUE("Electrique");

    private String mot;

    TypeMoteur(final String pMot) {
        mot = pMot;
    }

    public String toString() {
        return mot;
    }
}
