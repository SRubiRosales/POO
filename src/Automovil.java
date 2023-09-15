public class Automovil {
    String fabricante;
    String modelo;
    String color = "Gris";
    double cinlindrada;

    public String detalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nauto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cinlindrada = " + this.cinlindrada);
        return sb.toString();
    }
}
