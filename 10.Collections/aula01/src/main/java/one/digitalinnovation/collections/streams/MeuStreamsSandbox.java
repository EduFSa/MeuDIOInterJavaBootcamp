package one.digitalinnovation.collections.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MeuStreamsSandbox {
    public static void main(String[] args) {
        ArrayList<Estudante> listaEstudantes = new ArrayList<Estudante>();
        listaEstudantes.add(new Estudante("Astrogildo", 43, Genero.Masculino));
        listaEstudantes.add(new Estudante("Hermenegildo", 50, Genero.Masculino));
        listaEstudantes.add(new Estudante("Magnólia", 60, Genero.Feminino));
        listaEstudantes.add(new Estudante("Creyson", 22, Genero.Masculino));
        listaEstudantes.add(new Estudante("Bruno", 17, Genero.Indefinido));
        listaEstudantes.add(new Estudante("Jefferson", 18, Genero.Masculino));

        // A: Transforme cada estudante em uma string com os atributos do objeto
        String estudantes = listaEstudantes.stream()
                .map(estudante -> estudante.getNome().concat("=").concat(Integer.toString(estudante.getIdade())))
                .collect(Collectors.joining(", ")); // joining para uso em strings em vez de fazer como lista
        System.out.println(estudantes);
        System.out.println();

        // D: Exiba cada elemento no console
        listaEstudantes.stream().forEach(System.out::println);
        System.out.println();

        // B: Conte a quantidade de estudantes na lista usando stream
        System.out.println("Quantidade de alunos: " + listaEstudantes.stream().count());

        // C: Filtre estudantes com idade igual ou superior a 18 anos
        System.out.println(
                "Alunos maiores de 18 anos: " + listaEstudantes.stream().filter(estudante -> estudante.getIdade() >= 18)
                        .map(estudante -> estudante.getNome()).collect(Collectors.joining(", ")));

        // E: Retorne estudantes com nome que possua a letra B
        System.out.println("Alunos com a letra B: "
                + listaEstudantes.stream().filter(estudante -> estudante.getNome().toLowerCase().contains("b"))
                        .map(estudante -> estudante.getNome()).collect(Collectors.joining(", ")));

        // F: Retorne se existe ao menos um estudante com a letra D no nome
        System.out
                .println(listaEstudantes.stream().anyMatch(estudante -> estudante.getNome().toLowerCase().contains("d"))
                        ? "Existe pelo menos um estudante com a letra D"
                        : "Não existe estudante com a letra D");
        // G: Retorne o estudante mais velho e o mais novo da lista de estudantes
        listaEstudantes.stream().max(Comparator.comparingInt(Estudante::getIdade)).ifPresent(estudante -> {
            System.out.print("Mais velh" + estudante.getPronome().toLowerCase() + " é: ");
            System.out.println(estudante);
        });
        listaEstudantes.stream().min(Comparator.comparingInt(Estudante::getIdade)).ifPresent(estudante -> {
            System.out.print("Mais nov" + estudante.getPronome().toLowerCase() + " é: ");
            System.out.println(estudante);
        });
    }
}
