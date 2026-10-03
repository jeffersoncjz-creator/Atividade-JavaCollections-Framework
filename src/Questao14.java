import java.util.HashMap;
import java.util.Map;

public class Questao14 {

    static void main() {

        Map<String, Pessoa> pessoas = new HashMap<>();

        pessoas.put("111.111.111-11", new Pessoa("Ana", 28, "111.111.111-11"));

        pessoas.put("222.222.222-22", new Pessoa("Bruno", 19, "222.222.222-22"));

        pessoas.put("333.333.333-33", new Pessoa("Carla", 35, "333.333.333-33"));

        pessoas.entrySet().forEach(p -> {
            System.out.println(
                    "Chave: " + p.getKey()
                            + " - Valor: " + p.getValue()
            );
        });

        System.out.println(
                "Busca: " + pessoas.get("222.222.222-22")
        );

        Pessoa pessoaAnterior = pessoas.put("222.222.222-22",
                new Pessoa("Bruna", 20, "222.222.222-22"));

        System.out.println("Put retornou: " + pessoaAnterior);

        System.out.println("Tamanho do mapa: " + pessoas.size());
    }
}