package exemplo.concretDecorator;

import exemplo.baseDecorator.Adicionais;
import exemplo.component.Componente;

public class Morango extends Adicionais {

    public Morango(Componente wrappee) {
        super(wrappee, "Morango", 5.0);

    }

}
