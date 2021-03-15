
import java.util.List;

public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        CaixaEletronico caixa = new CaixaEletronico(10, 10, 10, 10);
        List<Integer> array = caixa.saque(585);
        System.out.println(array.toString());
    }

}
