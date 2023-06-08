public class Main {

    public static void main(String[] args) {
        Caja a = new CajaCarton(50, 160, 140);
        a.etiqueta = "Dirección envío";
        System.out.println(a);
        System.out.println("Volumen: " + a.getVolumen());

        CajaCarton b = new CajaCarton(74.6, 45.3, 90);
        b.etiqueta = 66;
        System.out.println(b);
        System.out.println("Volumen: " + b.getVolumen());
    }
}
