import java.util.HashMap;
import java.util.Map;

public class Questao11 {

    static void main() {

        Map<String, Integer> pessoas = new HashMap<>();

        pessoas.put("João", 30);
        pessoas.put("Maria", 25);
        pessoas.put("Pedro", 41);

        for (Map.Entry<String, Integer> pessoa : pessoas.entrySet()) {

            System.out.println(
                    pessoa.getKey() + " tem "
                            + pessoa.getValue() + " anos"
            );
        }
    }
}