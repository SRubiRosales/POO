public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil auto = new Automovil();
        auto.fabricante = "Nissan";
        auto.modelo = "Tsuru";
        auto.cinlindrada = 1.8;

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cinlindrada = 2.0;
        mazda.color = "Rojo";

        System.out.println("auto.fabricante " + auto.fabricante);
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cinlindrada = " + auto.cinlindrada);

        System.out.println("mazda.fabricante " + mazda.fabricante);
        System.out.println("mazda.modelo = " + mazda.modelo);
        System.out.println("mazda.color = " + mazda.color);
        System.out.println("mazda.cinlindrada = " + mazda.cinlindrada);
    }
}
