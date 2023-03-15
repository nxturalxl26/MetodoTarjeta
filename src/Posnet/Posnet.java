package Posnet;

public class Posnet {

    public static final double RECARGO_POR_CUOTAS = 0.03;
    public static final int MIN_CANT_CUOTAS = 1;
    public static final int MAX_CANT_CUOTAS = 6;

    public Ticket efectuarPago(TarjetaCredito tarjeta, double montoAAbonar, int cantCuotas){
        Ticket elTicket = null;

        if (datovalidoEsValido(tarjeta,montoAAbonar,cantCuotas)){
            double montoFinal = montoAAbonar + montoAAbonar * recargoSegunCuotas(cantCuotas);
            if (tarjeta.tieneSaldoDisponible(montoFinal)){
            tarjeta.descuento(montoFinal);
            String nombreApe = tarjeta.NombreCompletoTitutal();
            double montoPorCuotas = montoAAbonar / cantCuotas;
            elTicket = new Ticket(nombreApe,montoFinal,montoPorCuotas);
            }
        }
        return elTicket;
    }

    public boolean datovalidoEsValido(TarjetaCredito tarjeta, double monto, int cant){
        boolean esTarjetaValida = tarjeta != null;
        boolean esMontoValido = monto > 0;
        boolean cantCuotasVaidas = cant >= MIN_CANT_CUOTAS && cant <= MAX_CANT_CUOTAS;

        return esTarjetaValida && esMontoValido && cantCuotasVaidas;
    }
    private double recargoSegunCuotas(int cantCuotas){
        return (cantCuotas) * RECARGO_POR_CUOTAS;
    }
}
