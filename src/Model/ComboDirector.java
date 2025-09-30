package Model;

import Builder.ComboBuilder;

public class ComboDirector {
    private final ComboBuilder builder;

    public ComboDirector(ComboBuilder builder) {
        this.builder = builder;
    }

    /**
     * Construcción genérica de un combo personalizado.
     */
    public Combo construirCombo(String bebida, String acompanamiento, String extra) {
        return builder.withBebida(bebida)
                      .withAcompanamiento(acompanamiento)
                      .withExtra(extra)
                      .build();
    }

    /**
     * Construye un combo clásico predefinido.
     */
    public Combo construirComboClasico() {
        return builder.withBebida("Coca-Cola")
                      .withAcompanamiento("Papas fritas")
                      .withExtra("Helado")
                      .build();
    }

    /**
     * Construye un combo vegetariano predefinido.
     */
    public Combo construirComboVegetariano() {
        return builder.withBebida("Agua mineral")
                      .withAcompanamiento("Ensalada fresca")
                      .withExtra("Fruta")
                      .build();
    }

    /**
     * Construye un combo de pollo predefinido.
     */
    public Combo construirComboPollo() {
        return builder.withBebida("Inca Kola")
                      .withAcompanamiento("Arroz chaufa")
                      .withExtra("Salsa especial")
                      .build();
    }
}
