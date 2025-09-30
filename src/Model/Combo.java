package Model;

public class Combo {
    private String tipo;
    private String bebida;
    private String acompanamiento;
    private String extra;
    private double precioBase;

    public Combo(String tipo, double precioBase) {
        this.tipo = tipo;
        this.precioBase = precioBase;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getBebida() { return bebida; }
    public void setBebida(String bebida) { this.bebida = bebida; }

    public String getAcompanamiento() { return acompanamiento; }
    public void setAcompanamiento(String acompanamiento) { this.acompanamiento = acompanamiento; }

    public String getExtra() { return extra; }
    public void setExtra(String extra) { this.extra = extra; }

    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }

    @Override
    public String toString() {
        return "Tipo de combo: " + tipo + "\n"
             + "Bebida: " + (bebida == null ? "(no)" : bebida) + "\n"
             + "Acompañamiento: " + (acompanamiento == null ? "(no)" : acompanamiento) + "\n"
             + "Extra: " + (extra == null ? "(no)" : extra) + "\n"
             + String.format("Precio base: S/%.2f", precioBase);
    }
}
