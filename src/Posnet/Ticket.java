package Posnet;

public class Ticket {

    private String nombreApellido;
    private double montoTotal;
    private double montoPorCuotas;
    private Persona titular;

    public Ticket(String nombreApellido, double montoTotal, double montoPorCuotas) {
        this.nombreApellido = nombreApellido;
        this.montoTotal = montoTotal;
        this.montoPorCuotas = montoPorCuotas;
    }

    @Override
    public String toString() {
        return "Ticket{" + "NombreApellido " + nombreApellido + ", montoTotal = " + montoTotal + ", montoPorCuotas = " + montoPorCuotas;
    }
}
