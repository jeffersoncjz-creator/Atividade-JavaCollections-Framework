import java.util.ArrayList;
import java.util.List;

public class Questao3 {

    static void main() {

        List<String> frutas = new ArrayList<>();

        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");

        int indiceBanana = frutas.indexOf("banana");

        if (indiceBanana != -1) {
            System.out.println("\"banana\" encontrada no índice " + indiceBanana);
        }

        int indiceUva = frutas.indexOf("uva");

        if (indiceUva != -1) {
            System.out.println("\"uva\" encontrada no índice " + indiceUva);
        } else {
            System.out.println("\"uva\" não foi encontrada na lista");
        }
    }
}