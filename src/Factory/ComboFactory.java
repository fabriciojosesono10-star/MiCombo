package factory;

import model.Combo;

/**
 * Fábrica de combos.
 */
public class ComboFactory {

    public enum TipoCombo {
        HAMBURGUESA, CLASICO, POLLO, VEGETARIANO, GENERICO
    }

    /**
     * Crea un Combo según el tipo especificado.
     *
     * @param tipo tipo de combo
     * @return instancia de Combo
     */
    public static Combo createCombo(TipoCombo tipo) {
        if (tipo == null) return null;

        switch (tipo) {
            case HAMBURGUESA:
            case CLASICO:
                return new Combo("Hamburguesa", 15.00);
            case POLLO:
                return new Combo("Pollo", 14.00);
            case VEGETARIANO:
                return new Combo("Vegetariano", 13.00);
            default:
                return new Combo("Genérico", 10.00);
        }
    }
}
