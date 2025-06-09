package exemplo.teste;

import exemplo.baseDecorator.Adicionais;
import exemplo.concretComponent.Acai;
import exemplo.concretDecorator.Banana;
import exemplo.concretDecorator.Mel;
import exemplo.concretDecorator.Morango;
import exemplo.concretDecorator.Nutella;

public class Main {
    public static void main(String[] args) {
        Acai acai1 = new Acai("Açaí de 350ml", 10.00);
        Acai acai2 = new Acai("Açaí de 400ml", 15.00);
        Acai acai3 = new Acai("Açaí de 500ml", 20.00);
        Acai acai4 = new Acai("Açaí de 700ml", 25.00);

        Adicionais adicional = new Banana(acai1);
        Adicionais adicional2 = new Morango(new Nutella(acai2));
        Adicionais adicional3 = new Morango(new Nutella(new Mel(acai3)));

        System.out.println(adicional2.getNome());
        System.out.println("Valor: " + adicional2.getPreco());

        System.out.println(adicional.getNome());
        System.out.println("Valor: " + adicional.getPreco());

        System.out.println(adicional3.getNome());
        System.out.println("Valor: " + adicional.getPreco());

    }
}