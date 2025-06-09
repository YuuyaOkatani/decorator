package exemplo.concretDecorator;

import exemplo.baseDecorator.Adicionais;
import exemplo.component.Componente;

public class Nutella extends Adicionais {

    public Nutella(Componente componente) {
        super(componente, "Nutella", 5.0);
    }

}
