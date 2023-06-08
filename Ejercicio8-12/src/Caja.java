public class Caja {
    private final int ancho;
    private final int alto;
    private final int fondo;
    private String etiqueta;
    private Unidad unidad;

    public enum Unidad {
        CM, M
    }

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    public double getVolumen() {
        double volumen = ancho * alto * fondo;
        if (unidad == Unidad.CM) {
            volumen /= 1000000; // Convertir de cm³ a m³
        }
        return volumen;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEtiqueta(){
        return etiqueta;
    }

    @Override
    public String toString() {
        return "Caja: " + ancho + "x" + alto + "x" + fondo + " " + unidad + ", Etiqueta: " + etiqueta;
    }
}
