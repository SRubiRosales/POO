public class Automovil {
    String fabricante;
    String modelo;
    String color = "Gris";
    double cinlindrada;

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
}
