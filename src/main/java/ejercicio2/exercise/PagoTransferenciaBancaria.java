package ejercicio2.exercise;

public class PagoTransferenciaBancaria implements MetodoPagoImplementator {
    @Override
    public double descuento() {
        return 0.05;
    }

    @Override
    public String nombreFormaPago() {
        return "pago por transferencia bancaria";
    }
}
