package ejercicio2.exercise;

public class InstalacionAlcantarillado extends InstalacionAbstraction {


    @Override
    public void pagar() {
        System.out.println("Instalacion Agua> realizando "
                + metodoPagoImplementator.nombreFormaPago()
                + " con un descuento de "
                + (int) (metodoPagoImplementator.descuento() * 100) + "%");
    }
}
