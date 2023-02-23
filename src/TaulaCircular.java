public class TaulaCircular implements Cua {

    //atributs
    private int[] taula;
    private int finalTaula;
    private int tamany;

    public TaulaCircular(int n){
        taula = new int[n];
        tamany = n;
        finalTaula = 0;
    }

    @Override
    public void encuar(int i) {
        if(esPlena()){

        }else {
            taula[finalTaula] = i;
            finalTaula++;
        }
    }

    @Override
    public int desencuar() {
        int numero = 0;
        if(esBuida()){

        }else{
            numero = taula[finalTaula-1];
            finalTaula--;
        }
        return numero;
    }
    @Override
    public boolean esPlena() {
        return finalTaula == tamany;
    }

    @Override
    public boolean esBuida() {
        return finalTaula == 0;
    }
    // TODO
}
