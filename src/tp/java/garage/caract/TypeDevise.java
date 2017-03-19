package tp.java.garage.caract;

/**
 * TypeDevise : énumération des différents types de devise
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public enum TypeDevise {
    EUROS("€"),
    DOLLARS("$");

    private String dev;

    TypeDevise(final String pDev) {
        dev = pDev;
    }

    public String toString() {
        return dev;
    }

}
