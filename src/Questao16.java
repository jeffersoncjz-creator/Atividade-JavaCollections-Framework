import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Questao16 {

    static void main() {

        List<String> nomes = List.of("Ana", "Bruno", "Ana", "Carla", "Bruno", "Diego");
        List<String> nomesSemRepetir = new ArrayList<>(new LinkedHashSet<>(nomes));

        System.out.println(nomesSemRepetir);
    }
}
