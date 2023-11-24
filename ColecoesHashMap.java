import java.util.HashMap;
import java.util.Map;

public class ColecoesHashMap {

    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Luis", 10);
        notas.put("Dani", 10);
        notas.put("Murilo", 10);

        // var nota = notas.get("Dani");
        // System.out.println((nota));
        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + " e o valor é " + value);
        }
    }
}
