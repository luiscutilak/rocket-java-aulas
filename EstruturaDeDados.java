import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    
    public static void main(String[] args) {
        //Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Luis");
        nomes.add("Dani");
        nomes.add("Murilo");
        System.out.println(nomes.get(0));

        for (String nome : nomes) {
            System.out.println("O nome é " + nome);
        }
        // Abaixo função Lambda a partir do Java 8
        nomes.forEach(nome -> System.out.println("O nome que apareceu é " + nome));
    }
}
