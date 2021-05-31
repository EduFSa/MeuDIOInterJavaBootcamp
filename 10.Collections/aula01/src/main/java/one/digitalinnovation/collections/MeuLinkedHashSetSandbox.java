package one.digitalinnovation.collections;

import java.util.LinkedHashSet;
import java.util.Iterator;
// import java.util.Set;

public class MeuLinkedHashSetSandbox {
    public static void main(String[] args) {
        LinkedHashSet<Integer> seq = new LinkedHashSet<Integer>();
        seq.add(3);
        seq.add(88);
        seq.add(20);
        seq.add(44);
        seq.add(3);

        // Navegue no set exibindo cada número no console
        listarSet(seq);

        // Remova o primeiro item do Set
        Integer toBeRemoved = seq.iterator().next();
        System.out.println(toBeRemoved + " será removido");
        seq.remove(toBeRemoved);
        listarSet(seq);

        // Adicione um novo número (23)
        seq.add(23);
        listarSet(seq);

        // Verifique o tamanho do Set
        System.out.println("tamanho do conjunto: " + seq.size());

        // Verifique se o set está vazio
        if (seq.isEmpty())
            System.out.println("O conjunto está vazio");
    }

    private static void listarSet(LinkedHashSet<Integer> seq) {
        Iterator<Integer> nav = seq.iterator();
        System.out.print("Ítens do TreeSet: ");
        while (nav.hasNext()) {
            System.out.print(nav.next());
            if (nav.hasNext())
                System.out.print(", ");
        }
        System.out.println();
    }
}
