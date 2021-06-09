package one.digitalinnovation.collections;

import java.util.ArrayList;
import java.util.Optional;

public class MeuOptionalSandbox {
    public static void main(String[] args) {
        Optional<Integer> estadoPresente = Optional.of(Integer.valueOf(88));
        Optional<Integer> estadoVazio = Optional.empty();
        Optional<Integer> estadoNulo = Optional.ofNullable(null);
        ArrayList<Optional<Integer>> lista = new ArrayList<Optional<Integer>>();

        lista.add(estadoPresente);
        estadoPresente = Optional.of(Integer.valueOf(30));
        lista.add(estadoPresente);
        lista.add(estadoNulo);
        lista.add(estadoVazio);

        Integer a;

        for (Optional<Integer> o : lista) {
            o.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));
            o.orElseThrow(IllegalStateException::new);
            o.ifPresent((inteiro) -> System.out.println("**" + Integer.toString(inteiro)));
            if (o.isPresent()) {
                a = o.get();
                if (a > 30) {
                    System.out.println("Maior que 30");
                }

            }

        }
    }
}
