package Posnet;

public class MainTarget {
    public static void main(String[] args) {

        Posnet posnet = new Posnet();
        Persona p = new Persona("49593045","Aaron","Ayala","6271-6027","aaron.recuerdaa14@gmail.com");
        TarjetaCredito t = new TarjetaCredito("Banco General","3050895643",4000,p,EntidadFinanciera.BIRZA);

        System.out.println("Tarjeta antes del pago");
        System.out.println(t);

        System.out.println("Tarjeta tras pagar...");
        Ticket ticketGenerado = posnet.efectuarPago(t,500,5);
        System.out.println(ticketGenerado);

        System.out.println("Tarjeta despues del pago");
        System.out.println(t);
    }
}
