import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        Automovil tsuru = new Automovil("Nissan", "Tsuru", "Blanco", 1.8, 40);
        Automovil mazda = new Automovil("Mazda", "BT-50");
        Automovil ford = new Automovil("Ford", "Explorer", "Gris", 3.5, 50);
        Automovil ford2 = new Automovil("Ford", "Explorer", "Gris", 3.5, 50);
        Automovil auto = new Automovil();

        System.out.println(tsuru.verDetalle());
        System.out.println(mazda.verDetalle());
        Automovil.colorPatente = "Azul";
        System.out.println(ford.verDetalle());
        System.out.println(ford2.verDetalle());
        System.out.println(auto.verDetalle());
        Automovil.setColorPatente("Verde");
        System.out.println(Automovil.getColorPatente());
    }
}
