package one.digitalinnovation.collections.streams;

public class Estudante {
    private String nome;
    private int idade;
    private Genero genero;

    public Estudante(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.setGenero(genero);
    }

    public Genero getGenero() {
        return genero;
    }

    public String getPronome() {
        switch (this.genero) {
            case Masculino:
                return "o";
            case Feminino:
                return "a";
            default:
                return "x";
        }

    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        // Coinstrói a string sem concatenação
        return new StringBuilder().append(this.getNome()).append(", idade: ").append(this.getIdade()).toString();
    }

}

enum Genero {
    Masculino, Feminino, Indefinido
}