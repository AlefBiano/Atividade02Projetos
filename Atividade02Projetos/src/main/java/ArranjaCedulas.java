
import java.util.ArrayList;
import java.util.List;

public class ArranjaCedulas extends caixaAbstrato {

    List<Integer> arrayCedulas = new ArrayList<>();
    int aux;

    public ArranjaCedulas(int cem, int cinquenta, int vinte, int cinco) {
        super(cem, cinquenta, vinte, cinco);
    }

    protected List<Integer> cedulas(int valor) {
        arrayCedulas.add(0);
        arrayCedulas.add(0);
        arrayCedulas.add(0);
        arrayCedulas.add(0);
        while (valor != 0) {
            if (valor >= 100) {
                aux = valor / 100;
                if (aux <= cem) {
                    valor = valor - aux * 100;
                    arrayCedulas.set(0, aux);
                }
            } else if (valor >= 50) {
                aux = valor / 50;
                if (aux <= cinquenta) {
                    valor = valor - aux * 50;
                    arrayCedulas.set(1, aux);
                }
            } else if (valor >= 20) {
                aux = valor / 20;
                if (aux <= vinte) {
                    valor = valor - aux * 20;
                    arrayCedulas.set(2, aux);
                }
            } else if (valor >= 5) {
                aux = valor / 5;
                if (aux <= cinco) {
                    valor = valor - aux * 5;
                    arrayCedulas.set(3, aux);
                }
            }
        }
        return arrayCedulas;
    }
}
