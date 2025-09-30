package View;

import Model.Combo;
import java.util.Scanner;

public class ComboView {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarBienvenida() {
        System.out.println("=== BIENVENIDO A MiCombo ===");
    }

    // muestra opciones y retorna índice válido (0-based)
    public int pedirOpcion(String titulo, String[] opciones) {
        while (true) {
            System.out.println("\n" + titulo);
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ") " + opciones[i]);
            }
            System.out.print("Ingrese opción (1-" + opciones.length + "): ");
            String line = scanner.nextLine().trim();
            try {
                int v = Integer.parseInt(line);
                if (v >= 1 && v <= opciones.length) return v - 1;
            } catch (NumberFormatException ignored) {}
            System.out.println("Opción inválida. Intente de nuevo.");
        }
    }

    public void mostrarResumen(Combo combo) {
        System.out.println("\n--- Resumen del pedido ---");
        System.out.println(combo.toString());
    }
}
