package ejercicio2.exercise;

public class InstalacionElectrica extends InstalacionAbstraction {


    @Override
    public void pagar() {
        System.out.println("Instalacion Electrica> realizando "
                + metodoPagoImplementator.nombreFormaPago()
                + " con un descuento de "
                + (int) (metodoPagoImplementator.descuento() * 100) + "%");
    }
}
