package exemplo.concretDecorator;

import exemplo.baseDecorator.Adicionais;
import exemplo.component.Componente;

public class Mel extends Adicionais {
    public Mel(Componente componente) {
        super(componente, "Mel", 3.5);
    }
}
