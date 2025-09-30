
package Factory;

import Model.Combo;

public class ComboFactory {
    public static Combo createCombo(String tipo) {
        if (tipo == null) return null;
        switch (tipo.trim().toLowerCase()) {
            case "hamburguesa":
            case "clasico":
            case "clásico":
                return new Combo("Hamburguesa", 15.00);
            case "pollo":
                return new Combo("Pollo", 14.00);
            case "vegetariano":
                return new Combo("Vegetariano", 13.00);
            default:
                return new Combo("Genérico", 10.00);
        }
    }
}

