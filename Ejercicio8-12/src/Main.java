public class Main {
    public static void main(String[] args) {
        Caja caja = new Caja(10, 20, 30, Caja.Unidad.CM);
        System.out.println("Volumen de la caja: " + caja.getVolumen() + " m³");

        caja.setEtiqueta("Caja frágil");
        System.out.println("Etiqueta de la caja: " + caja.getEtiqueta());

        System.out.println(caja.toString());
    }
}
