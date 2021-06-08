package one.digitalinnovation.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

// Neste exercício, simularei a adicção de voltas de uma corrida em uma lista de 
// voltas, cada qual com seu número, na qual se ordenará as melhores voltas
public class MeuComparatorSandbox {
    public static void main(String[] args) {
        ArrayList<Volta> corrida = new ArrayList<Volta>();

        // Adicione elementos a essa lista
        corrida.add(new Volta(1, 59.4645f, true));
        corrida.add(new Volta(5, 59.4123f, true));
        corrida.add(new Volta(8, 59.7456f, true));
        corrida.add(new Volta(4, 58.834f, true));
        corrida.add(new Volta(2, 58.945f, false));
        corrida.add(new Volta(7, 58.42465f, false));
        corrida.add(new Volta(6, 58.564863f, true));
        corrida.add(new Volta(3, 59.0645f, true));
        System.out.println(corrida);

        // Ordene usando uma função lambda na chamada sort sem validar as voltas
        corrida.sort((voltaAnt, voltaPos) -> {
            return Float.compare(voltaAnt.getTempoEmSegundos(), voltaPos.getTempoEmSegundos());
        });
        System.out.println(corrida);

        // Reordenar a lista pelo número de voltas
        corrida.sort(Comparator.comparingInt(Volta::getNumero));
        System.out.println(corrida);

        // Ordenar as voltas considerando a validação porém utilizando as regras de
        // validação das voltas utilizando a classe ComparatorMelhoresVoltasValidadas
        Collections.sort(corrida, new ComparatorMelhoresVoltasValidadas());
        System.out.println(corrida);

        // Fazendo a mesma coisa de antes mas usando TreeSet para inserir ordenado com a
        // Volta implementando a interface Comparable
        TreeSet<VoltaComparable> corridaComparable = new TreeSet<VoltaComparable>();
        corridaComparable.add(new VoltaComparable(1, 59.4645f, true));
        corridaComparable.add(new VoltaComparable(2, 58.945f, false));
        corridaComparable.add(new VoltaComparable(3, 59.0645f, true));
        corridaComparable.add(new VoltaComparable(4, 58.834f, true));
        corridaComparable.add(new VoltaComparable(5, 59.4123f, true));
        corridaComparable.add(new VoltaComparable(6, 58.564863f, true));
        corridaComparable.add(new VoltaComparable(7, 58.42465f, false));
        corridaComparable.add(new VoltaComparable(8, 59.7456f, true));

        System.out.println(corridaComparable);

        // Reaproveitando o código e a primeira lista de corrida, é possível utilizar
        // o TreeMap adicionando a classe Comparator criada, levando em consideração que
        // o valor Strign será o piloto que fez a volta

        TreeMap<Volta, String> corridas = new TreeMap<Volta, String>(new ComparatorMelhoresVoltasValidadas());

        // Povoa o treemap com a lista anterior colocando as 4 primeiras da lista na
        // corrida 1
        corrida.sort(Comparator.comparingInt(Volta::getNumero));
        for (int i = 0; i < 4; i++) {
            corridas.put(corrida.remove(0), "Piquet");
        }
        for (Volta v : corrida) {
            corridas.put(v, "Senna");
        }

        System.out.println(corridas);
    }
}
