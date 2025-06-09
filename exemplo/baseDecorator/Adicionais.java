package exemplo.baseDecorator;

import exemplo.component.Componente;

public class Adicionais implements Componente {

    private Componente wrappee;

    private String nome;
    private Double preco;

    public Adicionais(Componente wrappee, String nome, Double preco) {
        this.wrappee = wrappee;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return wrappee.getNome() + " + " + nome;
    }

    @Override
    public Double getPreco() {
        return wrappee.getPreco() + preco;
    }

}
