package one.digitalinnovation.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MeuQueueSandbox {
    public static void main(String[] args) {

        // Adicione 5 nomes à fila
        Queue<String> fila = new LinkedList<String>();
        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        // Navegue na fila exibindo cada nome no console;
        Iterator<String> iter = fila.iterator();
        System.out.print("Pessoas na fila: ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            if (iter.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Retorne o primeiro item da fila sem removê-lo
        System.out.println("Primeiro da fila: " + fila.peek());

        // Retorne o primeiro da fila removendo-o
        System.out.println(fila.poll() + " saiu da fila");

        // Adicione Daniel
        String daniel = "Daniel";
        fila.add(daniel);
        System.out.println(daniel + " entrou e está na posição " + fila.size() + " da fila");

        // Retorne o tamanho da lista
        // -- cada nome entra fica no final da fila e já é a sua posição conforme
        // questão acima

        // Verifique se a lista está vazia
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia");
        } else {
            System.out.println("A fila não está vazia");
        }

        // Verifique se Carlos está na fila
        if (fila.contains("Carlos")) {
            System.out.println("Carlos está na fila");
        } else {
            System.out.println("Carlos já saiu da fila");
        }

    }
}
