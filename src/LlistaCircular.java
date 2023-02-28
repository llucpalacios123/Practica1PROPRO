import java.util.ArrayList;
import java.util.List;

public class LlistaCircular implements Cua {

    //atributs
    private int maxim;
    private int n_nodes;
    private Node primer; // Primer element
    private Node ultim;  // Últim element
    private Node actual; // Element actual


    private class Node {
        private int valor; // Número real dins la llista
        private Node seg;    // Següent node de la llista

        // Pre:  ---
        // Post: Crea un node amb els valors dels paràmetres
        Node(int valor, Node seg) {
            this.valor = valor;
            this.seg = seg;
        }
    }


    public LlistaCircular(int n){
        maxim = n;
        primer = null;
        ultim = null;
        actual = null;
        n_nodes = 0;
    }

    @Override
    public void encuar(int i) {
        if (esBuida()) {
            primer = new Node(i,null);
            ultim = primer;
            n_nodes++;
        }
        else {
            Node aux = new Node(i,null);
            ultim.seg = aux;
            ultim = aux;
        }
    }

    @Override
    public int desencuar() {
        int numero = 0;
        if(esBuida()){

        }else{
            numero = primer.valor;
            primer = primer.seg;
        }
        return numero;
    }

    @Override
    public boolean esPlena() {
        return n_nodes == maxim;
    }

    @Override
    public boolean esBuida() {
        return n_nodes == 0;
    }
    // TODO
}
