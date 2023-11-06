public class Automovil {
    private String fabricante;
    private String modelo;
    private String color = "Gris";
    private double cinlindrada;
    private int capacidadTanque = 40;

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cinlindrada) {
        this(fabricante, modelo, color);
        this.cinlindrada = cinlindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cinlindrada, int capacidadTanque) {
        this(fabricante, modelo, color, cinlindrada);
        this.capacidadTanque = capacidadTanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCinlindrada() {
        return cinlindrada;
    }

    public void setCinlindrada(double cinlindrada) {
        this.cinlindrada = cinlindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

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

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj instanceof Automovil) {
            return false;
        }
        Automovil o = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null &&
                this.fabricante.equals(o.getFabricante()) &&
                this.modelo.equals(o.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil: " +
                fabricante + " " + modelo;
    }
}
