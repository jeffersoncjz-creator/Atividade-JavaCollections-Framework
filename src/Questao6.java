import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Questao6 {

    static void main() {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Ana", 28, "111.111.111-11"));
        pessoas.add(new Pessoa("Bruno", 19, "222.222.222-22"));
        pessoas.add(new Pessoa("Carla", 35, "333.333.333-33"));
        pessoas.add(new Pessoa("Diego", 22, "444.444.444-44"));

        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade));

        System.out.println("Por idade:");

        pessoas.forEach(p -> System.out.println(p));

        pessoas.sort(Comparator.comparing(Pessoa::getNome));

        System.out.println("Por nome:");

        pessoas.forEach(p -> System.out.println(p));
    }
}
