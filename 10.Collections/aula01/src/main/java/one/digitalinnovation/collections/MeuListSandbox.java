package one.digitalinnovation.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MeuListSandbox {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();

        lista.add("Eduardo");
        lista.add("Felipe");
        lista.add("Digital");
        lista.add("Innovation");
        lista.add("One");

        System.out.println(lista);

        // Ordena a lista sem um Comparable explícito
        Collections.sort(lista);
        System.out.println(lista);

        // Coloca um item no lugar do outro
        lista.set(4, "Sá");
        System.out.println(lista);

        // Removendo itens pelo índice e elemento
        lista.remove(3);
        lista.remove("Felipe");
        System.out.println(lista);
        System.out.println(lista.size() + " ítens");
        System.out.println(lista.get(1) + " está na posição " + lista.indexOf("Eduardo"));
        if (lista.contains("Digital")) {
            lista.remove("Digital");
        } else {
            System.out.println("Digital já foi removido");
        }
        System.out.println(lista);

        System.out.println(lista.contains("Edu"));

        // Utilizando iterator para remover os objetos da lista
        Iterator<String> iter = lista.iterator();
        while (iter.hasNext()) {
            System.out.println("Iteration: " + iter.next());
            iter.remove();
        }

        lista.add("Teste");
        lista.add("De");
        lista.add("Inserção");

        // Imprime na tela os itens da tela e limpa a lista
        while (!lista.isEmpty()) {
            for (String s : lista) {
                System.out.println("Direct: " + s);
            }
            lista.clear();
        }

    }
}
