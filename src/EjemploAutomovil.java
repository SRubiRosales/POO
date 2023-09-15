public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil tsuru = new Automovil();
        tsuru.fabricante = "Nissan";
        tsuru.modelo = "Tsuru";
        tsuru.cinlindrada = 1.8;

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cinlindrada = 2.0;
        mazda.color = "Rojo";

        System.out.println(tsuru.detalle());
        System.out.println(mazda.detalle());
    }
}
