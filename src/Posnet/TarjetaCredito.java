package Posnet;

public class TarjetaCredito {

    private String entidadBancaria;
    private String numero;
    private double saldo;
    private Persona titular;
    private EntidadFinanciera entidad;

    public TarjetaCredito(String entidadBancaria, String numero, double saldo, Persona titular, EntidadFinanciera entidad) {
        this.entidadBancaria = entidadBancaria;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.entidad = entidad;
    }

    public boolean tieneSaldoDisponible(double monto){
        return saldo >= monto;
   }
   public void descuento(double monto){
         saldo = saldo - monto;
   }
   public String NombreCompletoTitutal(){
        return titular.nombreCompleto();
   }

    @Override
    public String toString() {
        return "TarjetaCredito{" + "entidadBancaria " + entidadBancaria + ", numero " + numero + ", saldo = " + saldo + ", entidadFinanciera" + entidad;
    }
}
