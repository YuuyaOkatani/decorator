package exemplo.concretComponent;

import exemplo.component.Componente;

public class Acai implements Componente {
    private String nome;
    private Double preco;

    public Acai(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public Double getPreco() {
        return preco;
    }

}
