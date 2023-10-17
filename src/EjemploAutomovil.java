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

        System.out.println(tsuru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(tsuru.acelerar(3000));
        System.out.println(mazda.frenar());
        System.out.println(mazda.acelerarFrenar(4000));
    }
}
