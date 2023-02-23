public interface Cua {
    // Descripció general: cua d'enters de capacitat
    //                     limitada

    void encuar(int i);
    // Afegeix un element a la cua
    // Pre:  La cua no és plena
    // Post: S'ha afegit  i  a la cua

    int desencuar();
    // Extreu un element de la cua
    // Pre:  La cua no és buida
    // Post: S'ha extret i retornat l'element més antic

    boolean esPlena();
    // Diu si la cua és plena

    boolean esBuida();
    // Diu si la cua és buida

}
