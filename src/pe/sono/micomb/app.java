package pe.sono.micomb;

import View.ComboView;
import Controller.ComboController;

public class app {
    public static void main(String[] args) {
        ComboView vista = new ComboView();
        ComboController controlador = new ComboController(vista);
        controlador.iniciar();
    }
}
