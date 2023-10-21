public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil tsuru = new Automovil("Nissan", "Tsuru", "Blanco", 1.8, 40);

        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setCinlindrada(2.0);
        mazda.setColor("Rojo");
        System.out.println(mazda.getFabricante());

        System.out.println(tsuru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(tsuru.acelerar(3000));
        System.out.println(mazda.frenar());
        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("Km por litro " + tsuru.calcularConsumo(300, 0.76f));
        System.out.println("Km por litro " + tsuru.calcularConsumo(300, 75));
    }
}
