package one.digitalinnovation.collections;

import java.util.Comparator;

public class ComparatorMelhoresVoltasValidadas implements Comparator<Volta> {

    @Override
    public int compare(Volta voltaAnt, Volta voltaPos) {
        if (voltaAnt.getValida() && voltaPos.getValida())
            return Float.compare(voltaAnt.getTempoEmSegundos(), voltaPos.getTempoEmSegundos());
        else if (!voltaPos.getValida()) // Se a segunda volta for inválida, a primeira será a melhor
            return Integer.MIN_VALUE;
        else if (!voltaAnt.getValida()) // Se a primeira volta for inválida, a segunda será a melhor
            return Integer.MAX_VALUE;
        else // Se ambas forem inválidas, usa-se a mesma regra das voltaPoss válidas, porém
             // irão para o final da lista
            return Float.compare(voltaAnt.getTempoEmSegundos(), voltaPos.getTempoEmSegundos());
    }

}
