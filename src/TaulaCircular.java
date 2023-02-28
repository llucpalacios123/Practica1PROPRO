public class TaulaCircular implements Cua {

    //atributs
    private int[] taula;
    private int final_taula;
    private int inici;
    private int tamany;

    public TaulaCircular(int n){
        taula = new int[n];
        tamany = n;
        final_taula = 0;
        inici = 0;
    }

    @Override
    public void encuar(int i) {
        if(esPlena()){

        }else {
            taula[final_taula%tamany] = i;
            final_taula = final_taula%tamany;
        }
    }

    @Override
    public int desencuar() {
        int numero = taula[inici];
        if(esBuida()){

        }else{
            inici = (inici+1)%tamany;

        }
        return numero;
    }
    @Override
    public boolean esPlena() {
        int tamany_t = final_taula - inici;
        if(tamany_t < 0){
            tamany_t = (final_taula + tamany) - inici;
        }
        return tamany_t == tamany;
    }

    @Override
    public boolean esBuida() {
        return final_taula == inici;
    }
    // TODO
}
