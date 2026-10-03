import java.util.HashMap;
import java.util.Map;

public class Questao12 {

    static void main() {

        Map<String, Integer> pessoas = new HashMap<>();

        pessoas.put("João", 30);
        pessoas.put("Maria", 25);
        pessoas.put("Pedro", 41);

        System.out.println("João tem " + pessoas.get("João") + " anos");

        if (pessoas.containsKey("Ana")) {
            System.out.println("Ana tem " + pessoas.get("Ana") + " anos");
        } else {
            System.out.println("Ana não está cadastrada");
        }
    }
}
