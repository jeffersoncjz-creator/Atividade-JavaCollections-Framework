import java.util.Map;
import java.util.TreeMap;

public class Questao13 {

    static void main() {

        TreeMap<String, Integer> pessoas = new TreeMap<>();

        pessoas.put("Rafael", 33);
        pessoas.put("Beatriz", 27);
        pessoas.put("Lucas", 19);
        pessoas.put("Amanda", 45);
        pessoas.put("Gustavo", 22);

        for (Map.Entry<String, Integer> pessoa : pessoas.entrySet()) {

            System.out.println(
                    pessoa.getKey() + ": " + pessoa.getValue()
            );
        }

        System.out.println(
                "Primeira: " + pessoas.firstKey()
                        + " | Última: " + pessoas.lastKey()
        );
    }
}