package Model;

import Builder.ComboBuilder;

public class ComboDirector {
    private ComboBuilder builder;

    public ComboDirector(ComboBuilder builder) {
        this.builder = builder;
    }

    public Combo construirCombo(String bebida, String acompanamiento, String extra) {
        return builder.withBebida(bebida)
                      .withAcompanamiento(acompanamiento)
                      .withExtra(extra)
                      .build();
    }
}

