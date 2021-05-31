package one.digitalinnovation.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BaralhoSetSandbox {
    public static void main(String[] args) {
        Set<Carta> baralho = new HashSet<Carta>();

        // Cria todas as cartas do baralho
        for (Naipe n : Naipe.values()) {
            for (Valor v : Valor.values()) {
                baralho.add(new Carta(n, v));
            }
        }

        System.out.println(baralho);
        System.out.println(baralho.size());
        Carta aRemover = escolheCarta(baralho, Valor.Dez, Naipe.Copas);
        System.out.println(aRemover);
        baralho.remove(aRemover);
        System.out.println(baralho.size());
        if (baralho.isEmpty())
            System.out.println("O baralho está vazio");

    }

    public static Carta escolheCarta(Set<Carta> baralho, Valor valor, Naipe naipe) {
        Carta temp = null;
        Iterator<Carta> seeker = baralho.iterator();

        while (seeker.hasNext()) {
            temp = seeker.next();
            if (temp.naipe == naipe && temp.valor == valor) {
                break;
            }
        }
        return temp;
    }
}

class Carta {
    public final Naipe naipe;
    public final Valor valor;

    Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor.toString() + " de " + naipe.toString();
    }
}

enum Naipe {
    Ouro, Copas, Paus, Espada
}

enum Valor {
    As, Dois, Tres, Quatro, Cinco, Seis, Sete, Oito, Nove, Dez, Valete, Dama, Rei
}