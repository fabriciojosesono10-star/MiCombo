package model;

/**
 * Representa un Combo de comida con tipo, precio y opciones adicionales.
 */
public class Combo {

    // Atributos obligatorios
    private final String tipo;
    private final double precioBase;

    // Atributos opcionales
    private String bebida;
    private String acompanamiento;
    private String extra;

    /**
     * Constructor principal: tipo y precio son obligatorios.
     *
     * @param tipo tipo de combo
     * @param precioBase precio base del combo
     */
    public Combo(String tipo, double precioBase) {
        this.tipo = tipo;
        this.precioBase = precioBase;
    }

    /**
     * Constructor alternativo para inicializar todos los campos.
     */
    public Combo(String tipo, double precioBase, String bebida, String acompanamiento, String extra) {
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.bebida = bebida;
        this.acompanamiento = acompanamiento;
        this.extra = extra;
    }

    // Getters
    public String getTipo() { return tipo; }
    public double getPrecioBase() { return precioBase; }
    public String getBebida() { return bebida; }
    public String getAcompanamiento() { return acompanamiento; }
    public String getExtra() { return extra; }

    // Setters para atributos opcionales
    public void setBebida(String bebida) { this.bebida = bebida; }
    public void setAcompanamiento(String acompanamiento) { this.acompanamiento = acompanamiento; }
    public void setExtra(String extra) { this.extra = extra; }

    @Override
    public String toString() {
        return "Tipo de combo: " + tipo + "\n"
             + "Bebida: " + (bebida == null ? "(no)" : bebida) + "\n"
             + "Acompañamiento: " + (acompanamiento == null ? "(no)" : acompanamiento) + "\n"
             + "Extra: " + (extra == null ? "(no)" : extra) + "\n"
             + String.format("Precio base: S/%.2f", precioBase);
    }
}
