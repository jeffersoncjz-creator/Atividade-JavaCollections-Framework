import java.util.TreeSet;

public class Questao10 {

    static void main() {

        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(50);
        numeros.add(10);
        numeros.add(30);
        numeros.add(10);
        numeros.add(40);
        numeros.add(20);
        numeros.add(30);

        System.out.println(numeros);

        System.out.println("Menor: " + numeros.first()
                + " | Maior: " + numeros.last());
    }
}
