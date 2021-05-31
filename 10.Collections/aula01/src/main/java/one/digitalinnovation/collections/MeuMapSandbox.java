package one.digitalinnovation.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MeuMapSandbox {
    public static void main(String[] args) {
        Map<String, Integer> pilotosTitulo = new HashMap<String, Integer>();

        // Adicione os pilotos brasileiros da F1 e a sua quantidade de títulos
        pilotosTitulo.put("Senna", 3);
        pilotosTitulo.put("Piquet", 3);
        pilotosTitulo.put("Massa", 1);
        pilotosTitulo.put("Castroneves", 4);

        listarPilotos(pilotosTitulo);

        // Retire o piloto Castroneves
        pilotosTitulo.remove("Castroneves");

        // Adicione Fitipaldi
        pilotosTitulo.put("Fittipaldi", 2);

        // Verifique o tamanho do mapa
        System.out.println(pilotosTitulo.size());

        // Remova o piloto que tem 1 título mundial se existir algum
        if (pilotosTitulo.containsValue(1)) {
            Iterator<Entry<String, Integer>> iter = pilotosTitulo.entrySet().iterator();
            Entry<String, Integer> e;
            while (iter.hasNext()) {
                e = iter.next();
                if (e.getValue() == 1)
                    iter.remove();
                break; // evita percorrer todo iterator
            }
        }

        listarPilotos(pilotosTitulo);

        // Verifique se Barrichello está na lista, caso contrário, adicione-o
        if (pilotosTitulo.containsKey("Barrichello") == false) {
            pilotosTitulo.put("Barrichello", 0);
        }

        listarPilotos(pilotosTitulo);

    }

    // Navegue por todos os registros do mapeamento
    private static void listarPilotos(Map<String, Integer> pilotosTitulo) {
        Iterator<String> pilotos = pilotosTitulo.keySet().iterator();
        while (pilotos.hasNext()) {
            String nomePiloto = pilotos.next();
            System.out.println(nomePiloto + " (" + pilotosTitulo.get(nomePiloto) + ") ");
        }
        System.out.println();
    }
}
