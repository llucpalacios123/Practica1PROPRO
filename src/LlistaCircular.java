import java.util.ArrayList;
import java.util.List;

public class LlistaCircular implements Cua {

    //atributs
    private List<Integer> llista;
    private int maxim;

    public LlistaCircular(int n){
        maxim = n;
        llista = new ArrayList<Integer>();
    }

    @Override
    public void encuar(int i) {
        llista.add(i);
    }

    @Override
    public int desencuar() {
        int numero = 0;
        if(esBuida()){

        }else{
            numero =  llista.get(llista.size()-1);
            llista.remove(llista.size()-1);
        }
        return numero;
    }

    @Override
    public boolean esPlena() {
        return llista.size() == maxim;
    }

    @Override
    public boolean esBuida() {
        return llista.size() == 0;
    }
    // TODO
}
