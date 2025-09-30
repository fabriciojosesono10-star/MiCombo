package Controller;

import Model.Combo;
import Factory.ComboFactory;
import Builder.ComboBuilder;
import View.ComboView;

public class ComboController {
    private ComboView view;

    public ComboController(ComboView view) {
        this.view = view;
    }

    public void iniciar() {
        view.mostrarBienvenida();

        String[] tipos = {"Hamburguesa", "Pollo", "Vegetariano"};
        String[] bebidas = {"Gaseosa 500ml", "Agua 500ml", "Jugo natural"};
        String[] acompanamientos = {"Papas medianas", "Aros de cebolla", "Ensalada"};
        String[] extras = {"Queso extra", "Tocino", "Salsa especial"};

        int idxTipo = view.pedirOpcion("Seleccione el tipo de combo:", tipos);
        Combo comboBase = ComboFactory.createCombo(tipos[idxTipo]);
        // chequeo por seguridad
        if (comboBase == null) {
            System.out.println("Error al crear combo base.");
            return;
        }

        int idxBebida = view.pedirOpcion("Seleccione la bebida:", bebidas);
        int idxAcomp = view.pedirOpcion("Seleccione el acompañamiento:", acompanamientos);
        int idxExtra = view.pedirOpcion("Seleccione el extra:", extras);

        // Usa el builder que recibe el Combo base
        ComboBuilder builder = new ComboBuilder(comboBase);
        builder.withBebida(bebidas[idxBebida])
               .withAcompanamiento(acompanamientos[idxAcomp])
               .withExtra(extras[idxExtra]);

        Combo finalCombo = builder.build();
        view.mostrarResumen(finalCombo);
    }
}
