package Builder;

import Model.Combo;

public class ComboBuilder {
    private Combo combo;

    // Constructor que recibe un Combo base
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

    public Combo build() {
        return combo;
    }
}
