package one.digitalinnovation.collections;

import java.util.Iterator;
// import java.util.Set;
import java.util.TreeSet;

public class MeuTreeSetSandbox {
    public static void main(String[] args) {
        TreeSet<Integer> seq = new TreeSet<Integer>();
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
        System.out.println(seq.pollFirst() + " foi removido");
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

    private static void listarSet(TreeSet<Integer> seq) {
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
