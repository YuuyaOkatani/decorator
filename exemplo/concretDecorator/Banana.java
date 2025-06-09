package exemplo.concretDecorator;

import exemplo.baseDecorator.Adicionais;
import exemplo.component.Componente;

public class Banana extends Adicionais {
    public Banana(Componente componente) {
        super(componente, "Banana", 3.5);

    }
}
