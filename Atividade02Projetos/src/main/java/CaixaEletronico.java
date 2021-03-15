
import java.util.List;

public class CaixaEletronico extends caixaAbstrato {

    public CaixaEletronico(int cem, int cinquenta, int vinte, int cinco) {
        super(cem, cinquenta, vinte, cinco);
        this.dinheiroArmazenado = this.dinheiroArmazenado = cem * 100 + cinquenta * 50 + vinte * 20 + cinco * 5;
    }

    private int dinheiroArmazenado;

    ArranjaCedulas cel = new ArranjaCedulas(this.cem, this.cinquenta, this.vinte, this.cinco);

    protected List<Integer> saque(int valor) {
        //verificar se o valor é > dinheiroarmazenado
        if (valor > dinheiroArmazenado || valor <= 0 || (valor % 5) != 0) {
            return null;
        } else {
            return cel.cedulas(valor);
        }
    }
}
