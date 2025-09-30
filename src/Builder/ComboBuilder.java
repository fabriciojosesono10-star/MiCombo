package builder;

import model.Combo;

/**
 * Builder para crear instancias de Combo de manera fluida.
 */
public class ComboBuilder {

    private final Combo combo;

    /**
     * Crea un nuevo ComboBuilder a partir de un Combo base.
     *
     * @param combo instancia inicial de Combo
     */
    public ComboBuilder(Combo combo) {
        this.combo = combo;
    }

    public ComboBuilder withBebida(String bebida) {
        combo.setBebida(bebida);
        return this;
    }

    public ComboBuilder withAcompanamiento(String acompanamiento) {
        combo.setAcompanamiento(acompanamiento);
        return this;
    }

    public ComboBuilder withExtra(String extra) {
        combo.setExtra(extra);
        return this;
    }

    /**
     * Construye y devuelve el Combo configurado.
     *
     * @return instancia final de Combo
     */
    public Combo build() {
        return combo;
    }
}
