public class Automovil {
    String fabricante;
    String modelo;
    String color = "Gris";
    double cinlindrada;
    int capacidadTanque = 40;

    public String verDetalle() {
        return "\nauto.fabricante = " + this.fabricante +
        "\nauto.modelo = " + this.modelo +
        "\nauto.color = " + this.color +
        "\nauto.cinlindrada = " + this.cinlindrada;
    }
    public String acelerar(int rpm) {
        return "El auto " + fabricante + " acelerando a  " + rpm + " rpm";
    }
    public String frenar() {
        return fabricante + " " + modelo + " frenando!";
    }
    public String acelerarFrenar(int rpm) {
        String acelerar = acelerar(rpm);
        String frenar = frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina) {
        return km/(capacidadTanque * porcentajeGasolina);
    }

    public float calcularConsumo(int km, int porcentajeGasolina) {
        return km/(capacidadTanque * (porcentajeGasolina/100f));
    }
}
