public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil tsuru = new Automovil("Nissan", "Tsuru", "Blanco", 1.8, 40);

        Automovil mazda = new Automovil("Mazda", "BT-50");
        System.out.println(mazda.getFabricante());

        Automovil ford = new Automovil("Ford", "Explorer", "Gris", 3.5, 50);
        Automovil ford2 = new Automovil("Ford", "Explorer", "Gris", 3.5, 50);
        System.out.println("Son iguales? " + (ford == ford2));
        System.out.println("Son iguales? " + (ford.equals(ford2)));

        System.out.println(tsuru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(ford.verDetalle());
        System.out.println(tsuru.acelerar(3000));
        System.out.println(mazda.frenar());
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("Km por litro " + tsuru.calcularConsumo(300, 0.76f));
        System.out.println("Km por litro " + tsuru.calcularConsumo(300, 75));
    }
}
